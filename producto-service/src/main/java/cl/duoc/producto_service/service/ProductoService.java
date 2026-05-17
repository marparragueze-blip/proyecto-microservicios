package cl.duoc.producto_service.service;

import cl.duoc.producto_service.model.Producto;
import cl.duoc.producto_service.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Producto crear(Producto producto) {
        return repository.save(producto);
    }

    public Producto actualizar(Long id, Producto producto) {
        producto.setId(id);
        return repository.save(producto);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

