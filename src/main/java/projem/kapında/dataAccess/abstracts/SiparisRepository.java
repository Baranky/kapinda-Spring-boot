package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Siparis;

public interface SiparisRepository extends JpaRepository<Siparis,Integer> {
}
