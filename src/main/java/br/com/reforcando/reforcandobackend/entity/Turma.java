package br.com.reforcando.reforcandobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private LocalDateTime dataCadastro;
    @Column(nullable = false)
    private LocalDateTime horaInicio;
    @Column(nullable = false)
    private LocalDateTime horaTermino;
}
