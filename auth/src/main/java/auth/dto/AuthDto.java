package auth.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AuthDto {
    private String username;
    private String tokenActual;
    private LocalDateTime fechaExpiracionToken;
}