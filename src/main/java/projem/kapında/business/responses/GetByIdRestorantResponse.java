package projem.kapında.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdRestorantResponse {

    private int restorantId;
    private String konum;
    private String restorantAdi;
}
