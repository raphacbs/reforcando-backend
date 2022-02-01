package br.com.reforcando.reforcandobackend.mapper;

import br.com.reforcando.reforcandobackend.dto.StudentDTO;
import br.com.reforcando.reforcandobackend.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student toModel(StudentDTO studentDTO);

    StudentDTO toDTO(Student student);

}
