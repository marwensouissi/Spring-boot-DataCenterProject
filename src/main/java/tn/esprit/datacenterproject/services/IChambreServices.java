package tn.esprit.datacenterproject.services;

import tn.esprit.datacenterproject.entities.Chambre;

import java.util.List;

public interface IChambreServices {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    List<Chambre> getAllChambres();
    Chambre getChambreById(Long idChambre);
    void deleteChambre(Long idChambre);
}
