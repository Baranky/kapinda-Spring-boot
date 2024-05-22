package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllKampanyaResponse {

    private int kampanyaId;
    private  int indirim;
    private Date baslangicTarihi;
    private Date bitisTarihi;
    private int siparisId;
}
