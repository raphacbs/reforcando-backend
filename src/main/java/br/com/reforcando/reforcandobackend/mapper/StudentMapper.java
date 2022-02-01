package br.com.reforcando.reforcandobackend.mapper;

import br.com.reforcando.reforcandobackend.dto.StudentDTO;
import br.com.reforcando.reforcandobackend.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student toModel(StudentDTO studentDTO);

    List<Student> toModel(List<StudentDTO> studentDTOs);

    StudentDTO toDTO(Student student);

    List<StudentDTO> toDTO(List<Student> students);

}
