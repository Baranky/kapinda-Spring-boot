package projem.kapında.business.responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllKuryeResponse {

    private int kuryeId;
    private  long telNo;
    private String adSoyad;
    private int restorantId;
}
