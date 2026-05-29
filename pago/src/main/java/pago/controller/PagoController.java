package pago.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import pago.model.PagoModel;
import pago.dto.PagoCreateDto;
import pago.service.PagoService;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    private final PagoService service;

    public PagoController(PagoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PagoModel> listar() {
        return service.listar();
    }

    @PostMapping
    public PagoModel crear(@RequestBody PagoCreateDto dto) {
        return service.guardar(dto);
    }
}
