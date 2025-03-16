package fr.dev.fitracoeur.dto.goals;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GoalResponseDTO {
    private Long id;
    private String description;
    private LocalDate targetDate;
    private boolean isCompleted;
}
