package mensaje.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MensajeCreateDto {
    @NotNull(message = "El id del emisor es obligatorio")
    private Long emisorId;
    
    @NotNull(message = "El id del receptor es obligatorio")
    private Long receptorId;
    
    @NotBlank(message = "El contenido del mensaje no puede estar vacío")
    private String contenido;
}