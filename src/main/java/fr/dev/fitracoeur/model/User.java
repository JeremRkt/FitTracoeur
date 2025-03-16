package fr.dev.fitracoeur.model;

import fr.dev.fitracoeur.model.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private LocalDate birthDate;
    private Double height;
    private Double weight;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Workout> workouts;

    @OneToMany(mappedBy = "user")
    private List<Goal> goals;

}
