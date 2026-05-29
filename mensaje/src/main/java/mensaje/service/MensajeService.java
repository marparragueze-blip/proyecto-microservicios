package mensaje.service;

import mensaje.dto.MensajeCreateDto;
import mensaje.dto.MensajeDto;
import mensaje.model.Mensaje;
import mensaje.repository.MensajeRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MensajeService {

    private final MensajeRepository mensajeRepository;

    public MensajeService(MensajeRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }

    public MensajeDto enviarMensaje(MensajeCreateDto createDto) {
        Mensaje mensaje = Mensaje.builder()
                .emisorId(createDto.getEmisorId())
                .receptorId(createDto.getReceptorId())
                .contenido(createDto.getContenido())
                .fechaEnvio(LocalDateTime.now())
                .build();
        return deEntidadADto(mensajeRepository.save(mensaje));
    }

    public List<MensajeDto> obtenerHistorial() {
        return mensajeRepository.findAll().stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private MensajeDto deEntidadADto(Mensaje mensaje) {
        MensajeDto dto = new MensajeDto();
        dto.setId(mensaje.getId());
        dto.setEmisorId(mensaje.getEmisorId());
        dto.setReceptorId(mensaje.getReceptorId());
        dto.setContenido(mensaje.getContenido());
        dto.setFechaEnvio(mensaje.getFechaEnvio());
        return dto;
    }
} 