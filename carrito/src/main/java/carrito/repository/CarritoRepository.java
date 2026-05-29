package carrito.repository;

import carrito.model.Carritomodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Carritomodel, Long> {
    List<Carritomodel> findByUsuarioId(Long usuarioId);
} 