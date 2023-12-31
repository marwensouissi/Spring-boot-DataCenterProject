package tn.esprit.datacenterproject.services;

import tn.esprit.datacenterproject.entities.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long idReservation);
    void deleteReservation(Long idReservation);
}
