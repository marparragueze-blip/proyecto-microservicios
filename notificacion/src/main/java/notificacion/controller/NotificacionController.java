package notificacion.controller;

import jakarta.validation.Valid;
import notificacion.dto.NotificacionCreateDto;
import notificacion.dto.NotificacionDto;
import notificacion.service.NotificacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    private final NotificacionService notificacionService;

    public NotificacionController(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @PostMapping
    public ResponseEntity<NotificacionDto> crear(@Valid @RequestBody NotificacionCreateDto dto) {
        return new ResponseEntity<>(notificacionService.crearNotificacion(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<NotificacionDto>> listar() {
        return ResponseEntity.ok(notificacionService.listarTodas());
    }
} 