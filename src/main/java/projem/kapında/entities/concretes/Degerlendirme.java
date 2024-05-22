package projem.kapında.entities.concretes;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "degerlendirme")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Degerlendirme {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "degerlendirmeId")
    private  int degerlendirmeId;

    @Column(name = "puan")
    private  double puan;

    @Column(name = "yorum")
    private String yorum;

    @Column(name = "tavsiye")
    private  Boolean tavsiye;

    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;

}
