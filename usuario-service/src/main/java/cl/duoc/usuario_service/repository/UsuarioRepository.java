package cl.duoc.usuario_service.repository;

import cl.duoc.usuario_service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
