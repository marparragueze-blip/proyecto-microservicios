package pago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pago.model.PagoModel;

public interface PagoRepository extends JpaRepository<PagoModel, Long> {
}
 