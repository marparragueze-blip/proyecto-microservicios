package cl.duoc.catalogo_service.repository;

import cl.duoc.catalogo_service.model.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
}
