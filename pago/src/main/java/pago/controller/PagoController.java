
package pago.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pago.dto.PagoCreateDto;
import pago.dto.PagoDto;
import pago.service.PagoService;
import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<PagoDto> pagar(@Valid @RequestBody PagoCreateDto dto) {
        return new ResponseEntity<>(pagoService.procesarPago(dto), HttpStatus.CREATED);
    }

    @getMapping
    public ResponseEntity<List<PagoDto>> historial() {
        return ResponseEntity.ok(pagoService.historialPagos());
    }
} 