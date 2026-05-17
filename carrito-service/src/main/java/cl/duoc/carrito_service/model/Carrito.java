package cl.duoc.carrito_service.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;

    @ElementCollection
    private List<Long> productosIds;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public List<Long> getProductosIds() { return productosIds; }
    public void setProductosIds(List<Long> productosIds) { this.productosIds = productosIds; }
}
