package envio.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "envios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private String direccionDestino;
    private String guiaSeguimiento;
    private String estadoEnvio; // EN_PREPARACION, EN_CAMINO, ENTREGADO
    private LocalDateTime fechaDespacho;
} 