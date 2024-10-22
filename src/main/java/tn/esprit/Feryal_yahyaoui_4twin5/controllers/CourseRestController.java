package tn.esprit.Feryal_yahyaoui_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;
import tn.esprit.Feryal_yahyaoui_4twin5.repositories.ICourseRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.services.ICourseServices;

@RequiredArgsConstructor
@RequestMapping("/course")
 @RestController
public class CourseRestController {
    @Autowired
    private final ICourseServices courseServices;
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse) {
        return courseServices.retrieveCourse(numCourse);
    }
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }


    @DeleteMapping("/delete/{numCourse}")
   public void deleteCourse(@PathVariable Long numCourse) {
        courseServices.removeCourse(numCourse);  }
}
