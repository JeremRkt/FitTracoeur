package fr.dev.fitracoeur.dto.goals;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GoalCreateDTO {
    @NotBlank
    private String description;

    @FutureOrPresent
    private LocalDate targetDate;

}
