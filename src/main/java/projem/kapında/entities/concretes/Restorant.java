package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projem.kapında.business.abstracts.Observer;

import java.io.Serial;
import java.util.List;

@Table(name = "restorantlar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restorant implements Observer {

    @Transient
    private  Siparis siparis;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "restorantId")
    private int restorantId;

    @Column(name = "konum")
    private String konum;

    @Column(name = "restorantAdi")
    private String restorantAdi;

    @OneToMany(mappedBy = "restorant")
    List<Yemek> yemekler;

    @OneToMany(mappedBy = "restorant")
    List<Kurye> kuryeler;

    @OneToMany(mappedBy = "restorant")
    List<Siparis> siparisler;

    @Override
    public void notify(String yeniDurum) {
        System.out.println( " müşteriye yeni durum bildirildi: "+ yeniDurum);
    }
}
