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
public class ResponsavelDTO {

    private Long id;
    private String nome;
    private String sobreNome;
    private Date dataNascimento;
    private Date dataCadastro;
}
