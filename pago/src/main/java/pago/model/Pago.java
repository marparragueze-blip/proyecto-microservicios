package pago.java;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private Double monto;
    private String metodoPago; // TARJETA, PAYPAL, TRANSFERENCIA
    private String estado;      // PENDIENTE, APROBADO, RECHAZADO
    private String transaccionId;
    private LocalDateTime fechaPago;
}