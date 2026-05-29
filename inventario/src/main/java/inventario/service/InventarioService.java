package cl.duoc.inventario.service;

import org.springframework.stereotype.Service;
import java.util.List;
import cl.duoc.inventario.model.InventarioModel;
import cl.duoc.inventario.repository.InventarioRepository;

@Service
public class InventarioService {
    private final InventarioRepository repo;

    public InventarioService(InventarioRepository repo) {
        this.repo = repo;
    }

    public List<InventarioModel> listar() { return repo.findAll(); }
    public InventarioModel guardar(InventarioModel inv) { return repo.save(inv); }
}
