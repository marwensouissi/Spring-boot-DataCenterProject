package tn.esprit.datacenterproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.datacenterproject.entities.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long>  {
}
