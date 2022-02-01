package br.com.reforcando.reforcandobackend.controller;

import br.com.reforcando.reforcandobackend.dto.ClassroomDTO;
import br.com.reforcando.reforcandobackend.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/classrooms")
public class ClassroomController {

    private ClassroomService classroomService;

    @Autowired
    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @PostMapping
    public ClassroomDTO create(@RequestBody @Valid ClassroomDTO classroomDTO) {
        return classroomService.create(classroomDTO);
    }

    @GetMapping("/{id}")
    public ClassroomDTO findById(@PathVariable Long id) {
        return classroomService.findById(id);
    }
}
