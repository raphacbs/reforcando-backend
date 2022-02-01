package br.com.reforcando.reforcandobackend.controller;

import br.com.reforcando.reforcandobackend.dto.StudentDTO;
import br.com.reforcando.reforcandobackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDTO create(@RequestBody @Valid StudentDTO studentDTO) {
        return this.studentService.create(studentDTO);
    }

    @GetMapping("/{id}")
    private StudentDTO findById(@PathVariable Long id) {
        return this.studentService.findById(id);
    }

    @GetMapping
    private List<StudentDTO> findAll() {
        return this.studentService.findAll();
    }
}
