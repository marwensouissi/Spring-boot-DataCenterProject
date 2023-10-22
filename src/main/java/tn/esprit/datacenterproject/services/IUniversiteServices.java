package tn.esprit.datacenterproject.services;

import tn.esprit.datacenterproject.entities.Universite;

import java.util.List;

public interface IUniversiteServices {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> getAllUniversites();
    Universite getUniversiteById(Long idUniversite);
    void deleteUniversite(Long idUniversite);
}
