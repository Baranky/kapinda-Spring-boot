package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.*;
import projem.kapında.business.abstracts.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "siparisler")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Siparis {
    @Transient
    private List<Observer> observers = new ArrayList<>();

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column(name = "siparisId")
    private int siparisId;

    @Column(name = "tarih")
    private Date tarih;

    @Column(name = "durum")
    private String durum;

    @Column(name = "toplam_fiyat")
    private  int toplamFiyat;

    @ManyToOne
    @JoinColumn(name = "kurye_id")
    private Kurye kurye;

    @ManyToOne
    @JoinColumn(name = "musteri_id")
    private  Musteri musteri;

    @ManyToOne
    @JoinColumn(name = "restorant_id")
    private Restorant restorant;


    @OneToMany(mappedBy = "siparis")
    List<Odeme> odemeler;



    @OneToMany(mappedBy = "siparis")
    List<Fatura> faturalar;

    @OneToMany(mappedBy = "siparis")
    List<Kampanya> kampanyalar;

    @OneToMany(mappedBy = "siparis")
    List<Degerlendirme> degerlendirmeler;

    public void setDurum(String durum) {
        this.durum = durum;
        bildirimGonder();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    private void bildirimGonder() {
        for (Observer observer : observers) {
            observer.notify(durum);
        }
    }
}
