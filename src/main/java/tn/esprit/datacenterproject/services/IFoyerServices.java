package tn.esprit.datacenterproject.services;

import tn.esprit.datacenterproject.entities.Foyer;

import java.util.List;

public interface IFoyerServices {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    List<Foyer> getAllFoyers();
    Foyer getFoyerById(Long idFoyer);
    void deleteFoyer(Long idFoyer);
}
