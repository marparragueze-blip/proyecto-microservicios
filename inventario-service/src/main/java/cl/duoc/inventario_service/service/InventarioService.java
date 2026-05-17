package cl.duoc.inventario_service.service;

import cl.duoc.inventario_service.model.Inventario;
import cl.duoc.inventario_service.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    private final InventarioRepository repository;

    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    public List<Inventario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Inventario> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Inventario crear(Inventario inventario) {
        return repository.save(inventario);
    }

    public Inventario actualizar(Long id, Inventario inventario) {
        inventario.setId(id);
        return repository.save(inventario);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
