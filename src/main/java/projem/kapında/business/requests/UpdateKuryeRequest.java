package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateKuryeRequest {
    private  int kuryeId;
    private  long telNo;
    private String adSoyad;
    private int restorantId;
}
