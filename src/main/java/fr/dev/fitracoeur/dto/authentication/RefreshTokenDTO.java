package fr.dev.fitracoeur.dto.authentication;

import jakarta.validation.constraints.NotBlank;

public class RefreshTokenDTO {
    @NotBlank
    private String refreshToken;
}
