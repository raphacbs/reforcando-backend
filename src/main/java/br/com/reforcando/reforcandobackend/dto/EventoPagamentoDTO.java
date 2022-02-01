package br.com.reforcando.reforcandobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventoPagamentoDTO {

    private Long id;
    private Date dataPagamento;
    private Double valor;
    private Date competencia;
    private AlunoDTO aluno;
}
