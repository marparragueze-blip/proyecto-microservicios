package cl.reportes.service;

import org.springframework.stereotype.Service;
import java.util.List;
import cl.reportes.model.ReportesModel;
import cl.reportes.repository.ReportesRepository;
import cl.reportes.dto.ReportesDTO;
import cl.reportes.dto.ReportesCreateDTO;

@Service
public class ReportesService {
    private final ReportesRepository repo;

    public ReportesService(ReportesRepository repo) {
        this.repo = repo;
    }

    public List<ReportesModel> listar() {
        return repo.findAll();
    }

    public ReportesModel guardar(ReportesCreateDTO dto) {
        ReportesModel reporte = new ReportesModel();
        reporte.setTipo(dto.getTipo());
        reporte.setContenido(dto.getContenido());
        reporte.setFecha(dto.getFecha());
        return repo.save(reporte);
    }

    public ReportesDTO convertirADTO(ReportesModel reporte) {
        ReportesDTO dto = new ReportesDTO();
        dto.setId(reporte.getId());
        dto.setTipo(reporte.getTipo());
        dto.setContenido(reporte.getContenido());
        dto.setFecha(reporte.getFecha());
        return dto;
    }
}
