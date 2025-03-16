package fr.dev.fitracoeur.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Double weight;
    private Double bodyFatPercentage;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
