package auth.repository;

import auth.model.AuthUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<AuthUsuario, Long> {
    Optional<AuthUsuario> findByUsername(String username);
} 