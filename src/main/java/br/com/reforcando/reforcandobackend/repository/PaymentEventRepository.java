package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.PaymentEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentEventRepository extends JpaRepository<PaymentEvent, Long> {
    List<PaymentEvent> findByStudentId(Long studentId);
}
