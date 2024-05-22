package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Musteri;

public interface MusteriRepository extends JpaRepository<Musteri,Integer> {
}
