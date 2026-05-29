package carrito.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carritos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carritomodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long catalogoId;
    private Integer cantidad;
} 