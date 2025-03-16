package fr.dev.fitracoeur.dto.progresstracking;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProgressLogDTO {
    @NotNull
    private LocalDate date;

    @Positive
    private Double weight;

    @Positive
    @Max(100)
    private Double bodyFatPourcentage;
}
