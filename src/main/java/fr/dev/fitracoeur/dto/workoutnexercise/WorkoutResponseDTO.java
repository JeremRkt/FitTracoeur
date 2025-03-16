package fr.dev.fitracoeur.dto.workoutnexercise;

import fr.dev.fitracoeur.model.enums.WorkoutType;
import java.time.LocalDateTime;
import java.util.List;

public class WorkoutResponseDTO {
    private Long id;
    private String name;
    private WorkoutType type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer totalCalories;
    private List<ExerciseDTO> exercises;
}
