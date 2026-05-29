package envio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {

    @GetMapping("/envio")
    public String envio() {
        return "Servicio ENVIO funcionando";
    }
} 
