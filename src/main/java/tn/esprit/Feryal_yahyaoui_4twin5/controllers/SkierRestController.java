package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SkierServicesImpl;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    @Autowired
    private final SkierServicesImpl skierService;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return  skierService.retrieveSkier(numSkier);
    }
}


