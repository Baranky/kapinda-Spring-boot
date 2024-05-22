package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateRestorantRequest {
    private  int restorantId;
    private String konum;
    private String restorantAdi;
}
