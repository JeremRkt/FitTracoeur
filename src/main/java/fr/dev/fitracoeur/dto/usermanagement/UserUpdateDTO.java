package fr.dev.fitracoeur.dto.usermanagement;

import fr.dev.fitracoeur.model.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserUpdateDTO {
    @Size(min = 4, max = 20)
    private String username;

    @Email
    private String email;

    @Past
    private LocalDate birthDate;

    @Positive
    private Double height;

    @Positive
    private Double weight;

    private Gender gender;
}
