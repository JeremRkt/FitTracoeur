package fr.dev.fitracoeur.dto.authentication;

import fr.dev.fitracoeur.dto.usermanagement.UserResponseDTO;
import lombok.Data;

@Data
public class LoginResponseDTO {
    private String accessToken;
    private String refreshToken;
    private UserResponseDTO user;
}
