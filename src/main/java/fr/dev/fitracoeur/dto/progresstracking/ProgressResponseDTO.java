package fr.dev.fitracoeur.dto.progresstracking;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProgressResponseDTO {
    private Long id;
    private LocalDate date;
    private Double weight;
    private Double bodyFatPourcentage;
}
