package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Piste;
import tn.esprit.Feryal_yahyaoui_4twin5.services.PisteServicesImpl;

@RequiredArgsConstructor
@RequestMapping("piste")
@RestController
public class PisteRestController {
    @Autowired
    private final PisteServicesImpl pisteServices;

    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste) {
        return pisteServices.retrievePiste(numPiste);
    }
}
