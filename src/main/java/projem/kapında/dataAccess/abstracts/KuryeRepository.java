package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Kurye;

public interface KuryeRepository extends JpaRepository<Kurye,Integer> {
}
