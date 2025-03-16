package fr.dev.fitracoeur.dto.authentication;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {
    @NotBlank
    private String emailOrUsername;

    @NotBlank
    private String password;
}
