package projem.kapında.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class GetByIdMusteriResponse {
    private int musteriId;
    private  String adsoyad;
    private  String adres;
    private  String telNo;

}
