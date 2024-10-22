package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Registration;
import tn.esprit.Feryal_yahyaoui_4twin5.services.RegistrationServicesImpl;

@RequiredArgsConstructor
@RequestMapping("registration")
@RestController
public class RegistrationRestController {
    @Autowired
    private final RegistrationServicesImpl  registrationServices;
    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }
}

