package carrito.controller;

import carrito.dto.CarritoCreateDto;
import carrito.dto.CarritoDto;
import carrito.service.CarritoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carrito")
public class CarritoController {

    private final CarritoService carritoService;

    public CarritoController(CarritoService carritoService) {
        this.carritoService = carritoService;
    }

    @PostMapping
    public ResponseEntity<CarritoDto> agregar(@Valid @RequestBody CarritoCreateDto dto) {
        return new ResponseEntity<>(carritoService.agregarAlCarrito(dto), HttpStatus.CREATED);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<CarritoDto>> listarPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(carritoService.obtenerPorUsuario(usuarioId));
    }
} 