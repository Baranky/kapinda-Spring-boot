package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projem.kapında.business.abstracts.Observer;

import java.util.List;

@Table(name = "kuryeler")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Kurye implements Observer {

    @Transient
    private Siparis siparis;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "kuryeId")
    private int kuryeId;

    @Column(name = "tel no")
    private  long telNo;

    @Column(name = "ad_soyad")
    private String adSoyad;

    @OneToMany(mappedBy = "kurye")
    List<Siparis> siparisler;

    @ManyToOne
    @JoinColumn(name = "retorant_id")
    private Restorant restorant;

    @Override
    public void notify(String yeniDurum) {
        System.out.println(" kuryeye yeni durum bildirildi: "+yeniDurum );
    }
}
