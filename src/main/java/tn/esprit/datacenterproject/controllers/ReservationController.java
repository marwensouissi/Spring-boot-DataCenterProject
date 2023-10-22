package tn.esprit.datacenterproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.datacenterproject.entities.Reservation;
import tn.esprit.datacenterproject.services.IReservationServices;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final IReservationServices reservationService;

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{idReservation}")
    public Reservation getReservationById(@PathVariable Long idReservation) {
        return reservationService.getReservationById(idReservation);
    }

    @DeleteMapping("/delete/{idReservation}")
    public void deleteReservation(@PathVariable Long idReservation) {
        reservationService.deleteReservation(idReservation);
    }
}
