package cl.duoc.carrito_service.controller;

import cl.duoc.carrito_service.model.Carrito;
import cl.duoc.carrito_service.service.CarritoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carritos")
public class CarritoController {

    private final CarritoService service;

    public CarritoController(CarritoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carrito> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrito> obtener(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Carrito crear(@RequestBody Carrito carrito) {
        return service.crear(carrito);
    }

    @PutMapping("/{id}")
    public Carrito actualizar(@PathVariable Long id, @RequestBody Carrito carrito) {
        return service.actualizar(id, carrito);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
