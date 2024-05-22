package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdDegerlendirmeResponse {
    private  int degerlendirmeId;
    private  double puan;
    private  Boolean tavsiye;
    private String yorum;
    private  int siparisId;
}
