package envio.service;

import envio.dto.EnvioCreateDto;
import envio.dto.EnvioDto;
import envio.model.Envio;
import envio.repository.EnvioRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EnvioService {

    private final EnvioRepository envioRepository;

    public EnvioService(EnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    public EnvioDto crearEnvio(EnvioCreateDto createDto) {
        Envio envio = Envio.builder()
                .pedidoId(createDto.getPedidoId())
                .direccionDestino(createDto.getDireccionDestino())
                .guiaSeguimiento("TRACK-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase())
                .estadoEnvio("EN_PREPARACION")
                .fechaDespacho(LocalDateTime.now())
                .build();
        return deEntidadADto(envioRepository.save(envio));
    }

    public List<EnvioDto> obtenerTodos() {
        return envioRepository.findAll().stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private EnvioDto deEntidadADto(Envio envio) {
        EnvioDto dto = new EnvioDto();
        dto.setId(envio.getId());
        dto.setPedidoId(envio.getPedidoId());
        dto.setDireccionDestino(envio.getDireccionDestino());
        dto.setGuiaSeguimiento(envio.getGuiaSeguimiento());
        dto.setEstadoEnvio(envio.getEstadoEnvio());
        dto.setFechaDespacho(envio.getFechaDespacho());
        return dto;
    }
} 