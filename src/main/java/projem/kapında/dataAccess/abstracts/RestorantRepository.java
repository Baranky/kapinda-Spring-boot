package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Restorant;

public interface RestorantRepository extends JpaRepository<Restorant,Integer> {
}
