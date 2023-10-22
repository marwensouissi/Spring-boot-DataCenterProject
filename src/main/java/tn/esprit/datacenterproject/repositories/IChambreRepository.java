package tn.esprit.datacenterproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.datacenterproject.entities.Chambre;

public interface IChambreRepository extends JpaRepository<Chambre, Long>  {
}
