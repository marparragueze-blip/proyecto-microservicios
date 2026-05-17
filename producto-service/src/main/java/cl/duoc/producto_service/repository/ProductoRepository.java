package cl.duoc.producto_service.repository;

import cl.duoc.producto_service.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
