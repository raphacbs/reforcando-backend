package br.com.reforcando.reforcandobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventoPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private Date dataPagamento;
    @Column(nullable = false)
    private Double valor;
    @Column(nullable = false)
    private Date competencia;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAluno")
    private Aluno aluno;
}
