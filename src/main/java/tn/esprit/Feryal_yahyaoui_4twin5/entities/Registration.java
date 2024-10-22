package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numregistration;
     private int numWeek;
   @ManyToOne
    Skier skier;
   @ManyToOne
    Course course;

}
