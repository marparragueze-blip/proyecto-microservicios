package mensaje.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {

    @GetMapping("/mensaje")
    public String mensaje() {
        return "Servicio MENSAJE funcionando";
    }
}