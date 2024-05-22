package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "odeme")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public  class Odeme {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "odemeId")
    private int odemeId;

    @Column(name = "odeme_miktarı")
    private  int odemeMiktarı;

    @Column(name = "odeme_turu")
    private String odemeTuru;

     @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;


}
