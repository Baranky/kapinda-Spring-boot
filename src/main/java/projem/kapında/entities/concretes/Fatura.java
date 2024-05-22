package projem.kapında.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "faturalar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fatura {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "faturaId")
    private  int faturaId;

    @Column(name = "fatura_Adresi")
    private String faturaAdres;


    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;

}
