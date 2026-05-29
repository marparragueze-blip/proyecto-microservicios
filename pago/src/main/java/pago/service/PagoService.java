package pago.service;

import org.springframework.stereotype.Service;
import pago.dto.PagoCreateDto;
import pago.dto.PagoDto;
import pago.model.Pago;
import pago.repository.PagoRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PagoService {

    private final PagoRepository pagoRepository;

    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    public PagoDto procesarPago(PagoCreateDto createDto) {
        Pago pago = Pago.builder()
                .pedidoId(createDto.getPedidoId())
                .monto(createDto.getMonto())
                .metodoPago(createDto.getMetodoPago())
                .estado("APROBADO") // Simulación de pasarela de pago aprobada
                .transaccionId(UUID.randomUUID().toString()) // Transacción única ficticia
                .fechaPago(LocalDateTime.now())
                .build();
        return deEntidadADto(pagoRepository.save(pago));
    }

    public List<PagoDto> historialPagos() {
        return pagoRepository.findAll().stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private PagoDto deEntidadADto(Pago pago) {
        PagoDto dto = new PagoDto();
        dto.setId(pago.getId());
        dto.setPedidoId(pago.getPedidoId());
        dto.setMonto(pago.getMonto());
        dto.setMetodoPago(pago.getMetodoPago());
        dto.setEstado(pago.getEstado());
        dto.setTransaccionId(pago.getTransaccionId());
        dto.setFechaPago(pago.getFechaPago());
        return dto;
    }
} 