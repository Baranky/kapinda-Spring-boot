package projem.kapında.business.concretes;

import lombok.Setter;
import org.springframework.stereotype.Service;
import projem.kapında.business.abstracts.OdemeStrategy;

@Service
@Setter
public class OdemeContext {
    private OdemeStrategy odemeStrategy;
    public void odemeYap(int miktar) {
        odemeStrategy.odemeYap(miktar);
    }
}

