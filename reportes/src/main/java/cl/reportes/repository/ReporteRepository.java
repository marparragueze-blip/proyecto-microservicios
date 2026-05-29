package cl.duoc.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.duoc.reportes.model.Reporte;

public interface ReporteRepository extends JpaRepository<Reporte, Long> {
}
