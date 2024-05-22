package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdOdemeResponse {
    private int odemeId;
    private  int odemeMiktarı;
    private String odemeTuru;
    private int siparisId;
}
