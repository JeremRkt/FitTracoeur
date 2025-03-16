package fr.dev.fitracoeur.dto.usermanagement;

import fr.dev.fitracoeur.model.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreateDTO {
    @NotBlank(message = "Username is required")
    @Size(min = 4, max = 20)
    private String username;

    @NotBlank(message = "Email is required")
    @Email
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must have at least 8 characters ")
    private String password;

    @Past(message = "Birth date must be in the past")
    private LocalDate birthDate;

    @Positive(message = "Height must be positive")
    private Double height; // in cm

    @Positive(message = "Weight must be positive")
    private Double weight; // in kg

    private Gender gender;
}
