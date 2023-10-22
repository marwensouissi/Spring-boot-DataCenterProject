package tn.esprit.datacenterproject.services;

import tn.esprit.datacenterproject.entities.Bloc;

import java.util.List;

public interface IBlocServices {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    List<Bloc> getAllBlocs();
    Bloc getBlocById(Long idBloc);
    void deleteBloc(Long idBloc);
}
