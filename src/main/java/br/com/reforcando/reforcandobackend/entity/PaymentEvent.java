package br.com.reforcando.reforcandobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PaymentEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime paymentDate;
    @Column(nullable = false)
    private Double value;
    @Column(nullable = false)
    private LocalDate reference;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAluno")
    private Student student;
}
