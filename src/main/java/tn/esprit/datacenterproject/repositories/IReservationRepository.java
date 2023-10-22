package tn.esprit.datacenterproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.datacenterproject.entities.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long>  {
}
