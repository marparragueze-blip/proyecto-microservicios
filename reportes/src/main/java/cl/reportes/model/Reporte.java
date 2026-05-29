package cl.duoc.reportes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reportes")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String contenido;
    private String fecha;

    // Getters y Setters
}
 