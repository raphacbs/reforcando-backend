package br.com.reforcando.reforcandobackend.mapper;

import br.com.reforcando.reforcandobackend.dto.PaymentEventDTO;
import br.com.reforcando.reforcandobackend.entity.PaymentEvent;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaymentEventMapper {
    PaymentEventMapper INSTANCE = Mappers.getMapper(PaymentEventMapper.class);

    PaymentEvent toModel(PaymentEventDTO paymentEventDTO);

    List<PaymentEvent> toModel(List<PaymentEventDTO> paymentEventDTO);

    PaymentEventDTO toDTO(PaymentEvent paymentEvent);

    List<PaymentEventDTO> toDTO(List<PaymentEvent> paymentEvent);
}
