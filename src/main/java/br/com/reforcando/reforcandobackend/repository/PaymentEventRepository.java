package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.PaymentEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentEventRepository extends JpaRepository<PaymentEvent, Long> {
}
