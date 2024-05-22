package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateDegerlendirmeRequest {
    private  int degerlendirmeId;
    private  double puan;
    private  Boolean tavsiye;
    private String yorum;
    private int siparisId;

}
