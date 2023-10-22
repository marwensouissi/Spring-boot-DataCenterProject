package tn.esprit.datacenterproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.datacenterproject.entities.Bloc;
import tn.esprit.datacenterproject.services.IBlocServices;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@RequiredArgsConstructor
public class BlocController {

    private final IBlocServices blocService;

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

    @GetMapping("/{idBloc}")
    public Bloc getBlocById(@PathVariable Long idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping("/delete/{idBloc}")
    public void deleteBloc(@PathVariable Long idBloc) {
        blocService.deleteBloc(idBloc);
    }
}
