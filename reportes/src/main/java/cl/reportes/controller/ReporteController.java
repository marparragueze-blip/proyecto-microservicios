package cl.duoc.reportes.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import cl.duoc.reportes.model.Reporte;
import cl.duoc.reportes.service.ReporteService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
    private final ReporteService service;

    public ReporteController(ReporteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Reporte> listar() { return service.listar(); }

    @PostMapping
    public Reporte crear(@RequestBody Reporte reporte) { return service.guardar(reporte); }
}
