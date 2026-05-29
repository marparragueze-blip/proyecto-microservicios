package cl.duoc.reportes.service;

import org.springframework.stereotype.Service;
import java.util.List;
import cl.duoc.reportes.model.Reporte;
import cl.duoc.reportes.repository.ReporteRepository;

@Service
public class ReporteService {
    private final ReportesRepository repo;

    public ReportesService(ReportesRepository repo) {
        this.repo = repo;
    }

    public List<Reporte> listar() { return repo.findAll(); }
    public Reportes guardar(Reportes reportes) { return repo.save(reportes); }
}
