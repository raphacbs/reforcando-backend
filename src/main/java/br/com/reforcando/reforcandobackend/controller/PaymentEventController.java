package br.com.reforcando.reforcandobackend.controller;

import br.com.reforcando.reforcandobackend.dto.PaymentEventDTO;
import br.com.reforcando.reforcandobackend.service.PaymentEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/payments-events")
public class PaymentEventController {

    private PaymentEventService paymentEventService;

    @Autowired
    public PaymentEventController(PaymentEventService paymentEventService) {
        this.paymentEventService = paymentEventService;
    }

    @PostMapping
    public PaymentEventDTO create(@RequestBody PaymentEventDTO paymentEventDTO) {
        return this.paymentEventService.create(paymentEventDTO);
    }

    @GetMapping
    public List<PaymentEventDTO> findAll() {
        return this.paymentEventService.findAll();
    }

    @GetMapping("/{id}")
    public PaymentEventDTO findById(@PathVariable Long id) {
        return this.paymentEventService.findById(id);
    }

}

