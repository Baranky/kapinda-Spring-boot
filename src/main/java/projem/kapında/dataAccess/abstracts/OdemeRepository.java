package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Odeme;

public interface OdemeRepository extends JpaRepository<Odeme,Integer> {
}
