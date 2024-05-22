package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatYemekRequest {

    private  String acıklama;
    private  int fiyat;
    private  String yemekAd;
    private int  restorantId;
    private int sepetId;
    private int siparisId;




}
