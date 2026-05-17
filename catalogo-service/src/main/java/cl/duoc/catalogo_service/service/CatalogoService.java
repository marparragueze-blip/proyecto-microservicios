package cl.duoc.catalogo_service.service;

import cl.duoc.catalogo_service.model.Catalogo;
import cl.duoc.catalogo_service.repository.CatalogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService {

    private final CatalogoRepository repository;

    public CatalogoService(CatalogoRepository repository) {
        this.repository = repository;
    }

    public List<Catalogo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Catalogo> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Catalogo crear(Catalogo catalogo) {
        return repository.save(catalogo);
    }

    public Catalogo actualizar(Long id, Catalogo catalogo) {
        catalogo.setId(id);
        return repository.save(catalogo);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
