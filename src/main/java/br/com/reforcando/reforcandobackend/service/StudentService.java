package br.com.reforcando.reforcandobackend.service;

import br.com.reforcando.reforcandobackend.dto.StudentDTO;
import br.com.reforcando.reforcandobackend.entity.Student;
import br.com.reforcando.reforcandobackend.mapper.StudentMapper;
import br.com.reforcando.reforcandobackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    private StudentMapper studentMapper = StudentMapper.INSTANCE;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO create(StudentDTO studentDTO) {
        Student studentToSave = this.studentMapper.toModel(studentDTO);
        Student studentSaved = this.studentRepository.save(studentToSave);
        return this.studentMapper.toDTO(studentSaved);
    }

    public StudentDTO findById(Long id) {
        Optional<Student> studentOptional = this.studentRepository.findById(id);
        return this.studentMapper.toDTO(studentOptional.orElse(null));
    }
}
