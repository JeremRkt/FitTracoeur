package fr.dev.fitracoeur.dto.usermanagement;

import fr.dev.fitracoeur.model.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private LocalDate birthDate;
    private Double height;
    private Double weight;
    private Gender gender;
}
