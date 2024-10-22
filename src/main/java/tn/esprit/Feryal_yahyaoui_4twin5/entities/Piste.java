package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.enums.Color;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numpiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;
    private int length;
    private int slope;
    @ManyToMany()
    Set<Skier> skiers;

}
