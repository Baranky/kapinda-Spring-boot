package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Degerlendirme;

public interface DegerlendirmeRepository extends JpaRepository<Degerlendirme,Integer> {
}
