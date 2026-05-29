package notificacion.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NotificacionDto {
    private Long id;
    private Long usuarioId;
    private String mensaje;
    private String tipo;
    private boolean leido;
    private LocalDateTime fechaCreacion;
}