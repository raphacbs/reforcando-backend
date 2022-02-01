package br.com.reforcando.reforcandobackend.entidade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


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
    private Date dataCadastro;
    @Column(nullable = false)
    private Time horaInicio;
    @Column(nullable = false)
    private Time horaTermino;
}
