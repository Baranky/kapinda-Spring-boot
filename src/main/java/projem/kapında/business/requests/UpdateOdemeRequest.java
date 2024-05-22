package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOdemeRequest {
    private  int odemeId;
    private  int odemeMiktarı;
    private String odemeTuru;
    private int siparisId;
}
