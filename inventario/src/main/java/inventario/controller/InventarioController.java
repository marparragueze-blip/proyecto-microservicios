package cl.duoc.inventario.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import cl.duoc.inventario.model.InventarioModel;
import cl.duoc.inventario.service.InventarioService;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<InventarioModel> listar() { return service.listar(); }

    @PostMapping
    public InventarioModel crear(@RequestBody InventarioModel inv) { return service.guardar(inv); }
}
