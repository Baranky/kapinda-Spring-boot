package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "yemekler")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Yemek {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column(name = "yemekId")
    private int yemekId;

    @Column(name = "yemekAd")
    private  String yemekAd;

    @Column(name = "fiyat")
    private  int fiyat;

    @Column(name = "acıklama")
    private  String acıklama;

    @ManyToOne
    @JoinColumn(name = "restorant_id")
    private  Restorant restorant;

    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;

    @OneToMany(mappedBy = "yemek")
    List<Sepet> sepetler;




}
