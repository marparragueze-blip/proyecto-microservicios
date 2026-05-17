package cl.duoc.carrito_service.service;

import cl.duoc.carrito_service.model.Carrito;
import cl.duoc.carrito_service.repository.CarritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {

    private final CarritoRepository repository;

    public CarritoService(CarritoRepository repository) {
        this.repository = repository;
    }

    public List<Carrito> listarTodos() {
        return repository.findAll();
    }

    public Optional<Carrito> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Carrito crear(Carrito carrito) {
        return repository.save(carrito);
    }

    public Carrito actualizar(Long id, Carrito carrito) {
        carrito.setId(id);
        return repository.save(carrito);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
