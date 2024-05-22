package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetByIdKuryeResponse {

    private int kuryeId;
    private  long telNo;
    private String adSoyad;
    private int restorantId;
}
