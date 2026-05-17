package cl.duoc.pago_service.repository;

import cl.duoc.pago_service.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}
