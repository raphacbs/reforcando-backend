package br.com.reforcando.reforcandobackend.service;

import br.com.reforcando.reforcandobackend.dto.ClassroomDTO;
import br.com.reforcando.reforcandobackend.entity.Classroom;
import br.com.reforcando.reforcandobackend.mapper.ClassroomMapper;
import br.com.reforcando.reforcandobackend.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper classroomMapper = ClassroomMapper.INSTANCE;

    @Autowired
    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public ClassroomDTO create(ClassroomDTO classroomDTO) {
        Classroom classroomToSave = classroomMapper.toModel(classroomDTO);
        Classroom classroomSaved = this.classroomRepository.save(classroomToSave);
        return classroomMapper.toDTO(classroomSaved);
    }


    public ClassroomDTO findById(Long id) {
        Optional<Classroom> optionalClass = classroomRepository.findById(id);
        return classroomMapper.toDTO(optionalClass.orElse(null));
    }
}
