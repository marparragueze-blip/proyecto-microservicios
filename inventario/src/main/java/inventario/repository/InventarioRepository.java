package cl.duoc.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.duoc.inventario.model.InventarioModel;

public interface InventarioRepository extends JpaRepository<InventarioModel, Long> {
}

