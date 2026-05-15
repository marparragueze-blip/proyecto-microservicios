package cl.duoc.producto_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private List<String> productos = new ArrayList<>();

    @GetMapping
    public List<String> listar() {
        return productos;
    }

    @PostMapping
    public String agregar(@RequestBody String producto) {
        productos.add(producto);
        return "Producto agregado: " + producto;
    }
}

