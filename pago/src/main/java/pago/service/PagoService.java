package pago.service;

import org.springframework.stereotype.Service;
import java.util.List;
import pago.model.PagoModel;
import pago.dto.PagoCreateDto;
import pago.repository.PagoRepository;

@Service
public class PagoService {
    private final PagoRepository repo;

    public PagoService(PagoRepository repo) {
        this.repo = repo;
    }

    public List<PagoModel> listar() {
        return repo.findAll();
    }

    public PagoModel guardar(PagoCreateDto createDto) {
        PagoModel pago = new PagoModel();
        pago.setPedidoId(createDto.getPedidoId());
        pago.setMonto(createDto.getMonto());
        pago.setMetodoPago(createDto.getMetodoPago());
        pago.setEstado("PENDIENTE");
        pago.setTransaccionId("TX-" + System.currentTimeMillis());
        pago.setFechaPago(java.time.LocalDate.now().toString());
        return repo.save(pago);
    }
}
 