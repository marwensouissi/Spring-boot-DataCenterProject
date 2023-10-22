package tn.esprit.datacenterproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.datacenterproject.entities.Bloc;

public interface IBlocRepository extends JpaRepository<Bloc, Long> {
}
