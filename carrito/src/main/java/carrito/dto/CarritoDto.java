package carrito.dto;

import lombok.Data;

@Data
public class CarritoDto {
    private Long id;
    private Long usuarioId;
    private Long catalogoId;
    private Integer cantidad;
} 