package pago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pago.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
} 