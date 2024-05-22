package projem.kapında.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projem.kapında.entities.concretes.Fatura;

public interface FaturaRepository extends JpaRepository<Fatura,Integer> {

}
