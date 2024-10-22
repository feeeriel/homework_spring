package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Instructor;
import tn.esprit.Feryal_yahyaoui_4twin5.services.IInstructorServices;

@RequiredArgsConstructor
@RequestMapping("instructor")
@RestController

public class InstructorRestController {
    @Autowired
    private final IInstructorServices instructorServices;

    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorServices.addInstructor(instructor);
    }
    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor) {
        return instructorServices.retrieveInstructor(numInstructor);
    }
    @PutMapping("update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorServices.updateInstructor(instructor);
    }
    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorServices.removeInstructor(numInstructor);
    }


}
