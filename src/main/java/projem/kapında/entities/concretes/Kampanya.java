package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "kampanyalar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Kampanya {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "kampanyaId")
    private int kampanyaId;

    @Column(name = "indirim")
    private  int indirim;

    @Column(name = "baslangıc_tarihi")
    private Date baslangicTarihi;

    @Column(name = "bitis_tarihi")
    private Date bitisTarihi;


    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;


}

