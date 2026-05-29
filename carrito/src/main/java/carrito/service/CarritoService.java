package carrito.service;

import carrito.dto.CarritoCreateDto;
import carrito.dto.CarritoDto;
import carrito.model.Carritomodel;
import carrito.repository.CarritoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarritoService {

    private final CarritoRepository carritoRepository;

    public CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    public CarritoDto agregarAlCarrito(CarritoCreateDto createDto) {
        Carritomodel carrito = Carritomodel.builder()
                .usuarioId(createDto.getUsuarioId())
                .catalogoId(createDto.getCatalogoId())
                .cantidad(createDto.getCantidad())
                .build();
        return deEntidadADto(carritoRepository.save(carrito));
    }

    public List<CarritoDto> obtenerPorUsuario(Long usuarioId) {
        return carritoRepository.findByUsuarioId(usuarioId).stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private CarritoDto deEntidadADto(Carritomodel carrito) {
        CarritoDto dto = new CarritoDto();
        dto.setId(carrito.getId());
        dto.setUsuarioId(carrito.getUsuarioId());
        dto.setCatalogoId(carrito.getCatalogoId());
        dto.setCantidad(carrito.getCantidad());
        return dto;
    }
} 