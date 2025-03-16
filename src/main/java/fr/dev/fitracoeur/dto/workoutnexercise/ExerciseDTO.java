package fr.dev.fitracoeur.dto.workoutnexercise;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ExerciseDTO {
    @NotBlank
    private String name;

    @Positive
    private Integer sets;

    @Positive
    private Integer reps;

    @Positive
    private Double weight;
}
