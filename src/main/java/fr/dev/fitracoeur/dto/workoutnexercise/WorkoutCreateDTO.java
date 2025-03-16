package fr.dev.fitracoeur.dto.workoutnexercise;

import fr.dev.fitracoeur.model.enums.WorkoutType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class WorkoutCreateDTO {
    @NotBlank
    private String name;

    private WorkoutType type;

    @NotNull
    private LocalDateTime startTime;

    @NotNull
    private LocalDateTime endTime;

    @NotEmpty
    private List<ExerciseDTO> exercises;
}
