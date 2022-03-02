package br.com.reforcando.reforcandobackend.service;

import br.com.reforcando.reforcandobackend.dto.PaymentEventDTO;
import br.com.reforcando.reforcandobackend.entity.PaymentEvent;
import br.com.reforcando.reforcandobackend.mapper.PaymentEventMapper;
import br.com.reforcando.reforcandobackend.repository.PaymentEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentEventService {
    private PaymentEventRepository paymentEventRepository;
    private PaymentEventMapper paymentEventMapper = PaymentEventMapper.INSTANCE;

    @Autowired
    public PaymentEventService(PaymentEventRepository paymentEventRepository) {
        this.paymentEventRepository = paymentEventRepository;
    }


    public PaymentEventDTO create(PaymentEventDTO paymentEventDTO) {
        PaymentEvent paymentEventToSave = this.paymentEventMapper.toModel(paymentEventDTO);
        PaymentEvent paymentEventSaved = this.paymentEventRepository.save(paymentEventToSave);
        return this.paymentEventMapper.toDTO(paymentEventSaved);
    }

    public List<PaymentEventDTO> findAll() {
        return this.paymentEventMapper.toDTO(this.paymentEventRepository.findAll());
    }

    public PaymentEventDTO findById(Long id) {
        Optional<PaymentEvent> paymentEventOptional = this.paymentEventRepository.findById(id);
        return this.paymentEventMapper.toDTO(paymentEventOptional.orElse(null));
    }

    public List<PaymentEventDTO> findByStudentId(Long studentId) {
        return this.paymentEventMapper.toDTO(this.paymentEventRepository.findByStudentId(studentId));
    }
}
