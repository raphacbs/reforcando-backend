package br.com.reforcando.reforcandobackend.controller;

import br.com.reforcando.reforcandobackend.dto.PaymentEventDTO;
import br.com.reforcando.reforcandobackend.service.PaymentEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
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
    public List<PaymentEventDTO> findAll(@RequestParam("studentId") Optional<Long> studentId) {
        if (studentId.isEmpty()) {
            return this.paymentEventService.findAll();
        } else {
            return this.paymentEventService.findByStudentId(studentId.get());
        }

    }

    @GetMapping("/{id}")
    public PaymentEventDTO findById(@PathVariable Long id) {
        return this.paymentEventService.findById(id);
    }

}

