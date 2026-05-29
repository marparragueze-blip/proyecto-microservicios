package cl.reportes.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import cl.reportes.model.ReportesModel;
import cl.reportes.service.ReportesService;
import cl.reportes.dto.ReportesCreateDTO;

@RestController
@RequestMapping("/reportes")
public class ReportesController {
    private final ReportesService service;

    public ReportesController(ReportesService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReportesModel> listar() {
        return service.listar();
    }

    @PostMapping
    public ReportesModel crear(@RequestBody ReportesCreateDTO dto) {
        return service.guardar(dto);
    }
}

 