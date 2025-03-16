package fr.dev.fitracoeur.dto.usermanagement;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PasswordChangeDTO {
    @NotBlank
    private String oldPassword;

    @NotBlank
    @Size(min = 8)
    private String newPassWord;
}
