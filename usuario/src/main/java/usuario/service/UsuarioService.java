package usuario.service;

import usuario.dto.UsuarioCreateDto;
import usuario.dto.UsuarioDto;
import usuario.model.Usuariomodel;
import usuario.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDto crear(UsuarioCreateDto createDto) {
        Usuariomodel usuario = Usuariomodel.builder()
                .nombre(createDto.getNombre())
                .email(createDto.getEmail())
                .password(createDto.getPassword())
                .rol(createDto.getRol() != null ? createDto.getRol() : "ROLE_USER")
                .build();
        return deEntidadADto(usuarioRepository.save(usuario));
    }

    public List<UsuarioDto> listarTodos() {
        return usuarioRepository.findAll().stream()
                .map(this::deEntidadADto)
                .collect(Collectors.toList());
    }

    private UsuarioDto deEntidadADto(Usuariomodel usuario) {
        UsuarioDto dto = new UsuarioDto();
        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());
        return dto;
    }
} 