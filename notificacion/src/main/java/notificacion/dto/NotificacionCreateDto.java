package notificacion.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class NotificacionCreateDto {
    @NotNull(message = "El id de usuario es obligatorio")
    private Long usuarioId;
    
    @NotBlank(message = "El mensaje de la notificación es obligatorio")
    private String mensaje;
    
    @NotBlank(message = "El tipo de notificación (EMAIL/SMS) es obligatorio")
    private String tipo;
}