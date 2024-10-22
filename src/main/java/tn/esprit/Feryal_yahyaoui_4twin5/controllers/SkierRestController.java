package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Skier;
import tn.esprit.Feryal_yahyaoui_4twin5.services.ISkierServices;
import tn.esprit.Feryal_yahyaoui_4twin5.services.SkierServicesImpl;

import java.time.LocalDate;
import java.util.Set;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierService;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return  skierService.retrieveSkier(numSkier);
    }
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier){
         skierService.removeSkier(numSkier);
    }
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }
}
