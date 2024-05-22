package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSiparisResponse {

    private int SiparisId;
    private Date tarih;
    private  int toplamFiyat;
    private String  durum;
    private int kuryeId;
    private int musteriId;

}
