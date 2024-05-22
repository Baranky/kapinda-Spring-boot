package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface OdemeStrategy {
    void odemeYap(int miktar);
}
