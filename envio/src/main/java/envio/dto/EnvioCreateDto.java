package envio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EnvioCreateDto {
    @NotNull(message = "El id del pedido es obligatorio")
    private Long pedidoId;
    
    @NotBlank(message = "La dirección de destino es obligatoria")
    private String direccionDestino;
} 