package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatOdemeRequest {

    private  int odemeMiktarı;
    private String odemeTuru;
    private int siparisId;
}
