package cl.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.reportes.model.ReportesModel;

public interface ReportesRepository extends JpaRepository<ReportesModel, Long> {
}
