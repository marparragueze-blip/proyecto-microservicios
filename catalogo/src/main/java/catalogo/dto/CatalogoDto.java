package catalogo.dto;

import lombok.Data;

@Data
public class CatalogoDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stockInicial;
} 
