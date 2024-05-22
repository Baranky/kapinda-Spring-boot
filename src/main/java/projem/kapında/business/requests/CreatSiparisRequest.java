package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreatSiparisRequest {

    private Date tarih;
    private  int toplamFiyat;
    private int kuryeId;
    private int musteriId;
    private String durum;



}
