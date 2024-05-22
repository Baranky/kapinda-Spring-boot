package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projem.kapında.entities.concretes.Siparis;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllFaturaResponse {

    private  int faturaId;
    private String faturaAdres;
    private int siparisId;

}
