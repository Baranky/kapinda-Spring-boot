package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projem.kapında.business.abstracts.Observer;

import java.util.List;

@Table(name = "musteriler")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Musteri  implements Observer {

    @Transient
    private Siparis siparis;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "musteriId")
    private int musteriId;

    @Column(name = "adSoyad")
    private  String adsoyad;

    @Column(name = "adres")
    private  String adres;

    @Column(name = "telNo")
    private  String telNo;

    @OneToMany(mappedBy = "musteri")
    List<Siparis> siparisler;

    @OneToMany(mappedBy = "musteri")
    List<Sepet> sepetler;


    @Override
    public void notify(String yeniDurum) {
        System.out.println("  müşteriye yeni durum bildirildi: "+ yeniDurum);
    }
}
