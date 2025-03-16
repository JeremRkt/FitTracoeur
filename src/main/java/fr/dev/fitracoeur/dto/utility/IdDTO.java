package fr.dev.fitracoeur.dto.utility;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class IdDTO {
    @NotNull
    private Long id;
}
