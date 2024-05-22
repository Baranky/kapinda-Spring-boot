package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import projem.kapında.entities.concretes.Odeme;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSiparisResponse {
    private int SiparisId;
    private Date tarih;
    private  int toplamFiyat;
    private String  durum;
    private int kuryeId;
    private int musteriId;


}
