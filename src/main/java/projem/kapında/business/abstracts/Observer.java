package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface Observer {
    void notify(String yeniDurum);
}
