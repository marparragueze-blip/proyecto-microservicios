package mensaje.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class MensajeDto {
    private Long id;
    private Long emisorId;
    private Long receptorId;
    private String contenido;
    private LocalDateTime fechaEnvio;
}