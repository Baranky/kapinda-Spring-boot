package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Sepet;

public interface SepetlemeRepository extends JpaRepository<Sepet,Integer> {
}
