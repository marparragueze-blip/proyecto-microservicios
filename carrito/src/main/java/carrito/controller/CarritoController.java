package carrito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarritoController {

    @GetMapping("/carrito")
    public String carrito() {
        return "Servicio CARRITO funcionando";
    }
}
