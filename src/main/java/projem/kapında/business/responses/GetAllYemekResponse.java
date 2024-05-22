package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllYemekResponse {
    private int yemekId;
    private  String acıklama;
    private  int fiyat;
    private  String yemekAd;
    private int  restorantId;
    private int sepetId;
    private int siparisId;


}
