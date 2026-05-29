package pago.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PagoDto {
    private Long id;
    private Long pedidoId;
    private Double monto;
    private String metodoPago;
    private String estado;
    private String transaccionId;
    private LocalDateTime fechaPago;
}