package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateFaturaRequest {
    private  int faturatId;
    private String faturaAdres;
    private  int siparisId;
}
