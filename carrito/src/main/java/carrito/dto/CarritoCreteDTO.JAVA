package carrito.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CarritoCreateDto {
    @NotNull(message = "El ID de usuario es obligatorio")
    private Long usuarioId;
    
    @NotNull(message = "El ID del elemento del catálogo es obligatorio")
    private Long catalogoId;
    
    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad mínima debe ser 1")
    private Integer cantidad;
} 