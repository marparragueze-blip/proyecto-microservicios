package inventario.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventariomodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long catalogoId; // Relación con el ID del catálogo correspondiente
    private Integer stockDisponible;
    private Integer stockMinimo;
    private String ubicacionAlmacen; // Ejemplo: "Pasillo A - Estante 4"
} 