package fr.dev.fitracoeur.model;

import fr.dev.fitracoeur.model.enums.WorkoutType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer caloriesBurned;

    @Enumerated(EnumType.STRING)
    private WorkoutType type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL)
    private List<Exercise> exercises;


}
