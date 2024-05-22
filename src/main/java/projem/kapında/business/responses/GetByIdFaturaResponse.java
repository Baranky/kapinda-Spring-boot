package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetByIdFaturaResponse {
    private  int faturaId;
    private String faturaAdres;
    private int siparisId;


}
