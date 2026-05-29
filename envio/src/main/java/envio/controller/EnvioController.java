package envio.controller;

import envio.dto.EnvioCreateDto;
import envio.dto.EnvioDto;
import envio.service.EnvioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {

    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    @PostMapping
    public ResponseEntity<EnvioDto> crear(@Valid @RequestBody EnvioCreateDto dto) {
        return new ResponseEntity<>(envioService.crearEnvio(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EnvioDto>> listar() {
        return ResponseEntity.ok(envioService.obtenerTodos());
    }
} 