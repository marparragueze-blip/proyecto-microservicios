package mensaje.controller;

import jakarta.validation.Valid;
import mensaje.dto.MensajeCreateDto;
import mensaje.dto.MensajeDto;
import mensaje.service.MensajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    private final MensajeService mensajeService;

    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping
    public ResponseEntity<MensajeDto> enviar(@Valid @RequestBody MensajeCreateDto dto) {
        return new ResponseEntity<>(mensajeService.enviarMensaje(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MensajeDto>> historial() {
        return ResponseEntity.ok(mensajeService.obtenerHistorial());
    }
} 