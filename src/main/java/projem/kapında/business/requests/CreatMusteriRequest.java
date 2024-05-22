package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreatMusteriRequest {
    private  String adsoyad;
    private  String adres;
    private  String telNo;

}
