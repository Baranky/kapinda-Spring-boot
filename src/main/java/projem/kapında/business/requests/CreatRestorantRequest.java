package projem.kapında.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatRestorantRequest {

    private String konum;
    private String restorantAdi;
}
