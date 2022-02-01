package br.com.reforcando.reforcandobackend.mapper;

import br.com.reforcando.reforcandobackend.dto.TurmaDTO;
import br.com.reforcando.reforcandobackend.entity.Turma;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TurmaMapper {
    TurmaMapper INSTANCE = Mappers.getMapper(TurmaMapper.class);

    Turma toModel(TurmaDTO turmaDTO);

    TurmaDTO toDTO(Turma turma);
}
