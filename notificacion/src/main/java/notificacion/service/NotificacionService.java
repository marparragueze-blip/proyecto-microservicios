package notificacion.service;

import notificacion.dto.NotificacionCreateDto;
import notificacion.dto.NotificacionDto;
import notificacion.model.Notificacion;
import notificacion.repository.NotificacionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificacionService {

    private final NotificacionRepository notificacionRepository;

    public NotificacionService(NotificacionRepository notificacionRepository) {
        this.notificacionRepository = notificacionRepository;
    }

    public NotificacionDto crearNotificacion(NotificacionCreateDto createDto) {
        Notificacion notificacion = Notificacion.builder()
                .usuarioId(createDto.getUsuarioId())
                .mensaje(createDto.getMensaje())
                .tipo(createDto.getTipo())
                .leido(false)
                .fechaCreacion(LocalDateTime.now())
                .build();
        return deEntidadADto(notificacionRepository.save(notificacion));
    }

    public List<NotificacionDto> listarTodas() {
        return notificacionRepository.findAll().stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private NotificacionDto deEntidadADto(Notificacion notificacion) {
        NotificacionDto dto = new NotificacionDto();
        dto.setId(notificacion.getId());
        dto.setUsuarioId(notificacion.getUsuarioId());
        dto.setMensaje(notificacion.getMensaje());
        dto.setTipo(notificacion.getTipo());
        dto.setLeido(notificacion.isLeido());
        dto.setFechaCreacion(notificacion.getFechaCreacion());
        return dto;
    }
} 