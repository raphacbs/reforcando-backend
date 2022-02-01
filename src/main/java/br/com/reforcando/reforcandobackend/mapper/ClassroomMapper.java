package br.com.reforcando.reforcandobackend.mapper;

import br.com.reforcando.reforcandobackend.dto.ClassroomDTO;
import br.com.reforcando.reforcandobackend.entity.Classroom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassroomMapper {
    ClassroomMapper INSTANCE = Mappers.getMapper(ClassroomMapper.class);

    Classroom toModel(ClassroomDTO classroomDTO);

    ClassroomDTO toDTO(Classroom aClassroom);
}
