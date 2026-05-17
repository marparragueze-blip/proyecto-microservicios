package cl.duoc.pago_service.service;

import cl.duoc.pago_service.model.Pago;
import cl.duoc.pago_service.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    private final PagoRepository repository;

    public PagoService(PagoRepository repository) {
        this.repository = repository;
    }

    public List<Pago> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pago> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Pago crear(Pago pago) {
        return repository.save(pago);
    }

    public Pago actualizar(Long id, Pago pago) {
        pago.setId(id);
        return repository.save(pago);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
