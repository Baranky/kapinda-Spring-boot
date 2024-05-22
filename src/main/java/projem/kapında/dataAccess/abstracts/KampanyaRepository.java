package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Kampanya;

public interface KampanyaRepository extends JpaRepository<Kampanya, Integer> {
}
