package tn.esprit.Feryal_yahyaoui_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Skier implements Serializable {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long numskier;
        private int idskier;
        private LocalDate birthDate;
        private String city;
        private String firstName;
        private String lastName;
        private int age;
        @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
        Subscription subscription;
        @OneToMany(mappedBy = "skier" ,fetch =FetchType.EAGER)
        Set<Registration> registrations;
        @ManyToMany(mappedBy = "skiers")
        Set<Piste> pistes;

}

