package projem.kapında.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "sepetim")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sepet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "sepetId")
    private int sepetId;

    @ManyToOne
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;

    @ManyToOne
    @JoinColumn(name = "yemek_id")
    private Yemek yemek;

}
