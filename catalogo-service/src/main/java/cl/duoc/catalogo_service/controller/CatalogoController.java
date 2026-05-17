package cl.duoc.catalogo_service.controller;

import cl.duoc.catalogo_service.model.Catalogo;
import cl.duoc.catalogo_service.service.CatalogoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogoController {

    private final CatalogoService service;

    public CatalogoController(CatalogoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Catalogo> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Catalogo> obtener(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Catalogo crear(@RequestBody Catalogo catalogo) {
        return service.crear(catalogo);
    }

    @PutMapping("/{id}")
    public Catalogo actualizar(@PathVariable Long id, @RequestBody Catalogo catalogo) {
        return service.actualizar(id, catalogo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
