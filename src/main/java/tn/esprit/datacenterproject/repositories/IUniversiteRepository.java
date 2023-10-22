package tn.esprit.datacenterproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.datacenterproject.entities.Universite;

public interface IUniversiteRepository extends JpaRepository<Universite, Long>  {
}
