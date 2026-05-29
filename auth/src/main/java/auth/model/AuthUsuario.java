package auth.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "auth_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String tokenActual;
    private LocalDateTime fechaExpiracionToken;
} 