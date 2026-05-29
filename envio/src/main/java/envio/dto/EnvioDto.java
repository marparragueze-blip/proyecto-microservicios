package envio.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class EnvioDto {
    private Long id;
    private Long pedidoId;
    private String direccionDestino;
    private String guiaSeguimiento;
    private String estadoEnvio;
    private LocalDateTime fechaDespacho;
} 