package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreatKampanyaRequest {

    private  int indirim;
    private Date baslangicTarihi;
    private Date bitisTarihi;
    private int siparisId;
}
