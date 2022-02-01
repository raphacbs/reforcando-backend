package br.com.reforcando.reforcandobackend.controller;

import br.com.reforcando.reforcandobackend.dto.MessageResponseDTO;
import br.com.reforcando.reforcandobackend.dto.TurmaDTO;
import br.com.reforcando.reforcandobackend.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/turmas")
public class TurmaController {

    private TurmaService turmaService;

    @Autowired
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping
    public MessageResponseDTO cadastra(@RequestBody @Valid TurmaDTO turmaDTO) {
        return turmaService.cadastra(turmaDTO);
    }

    @GetMapping("/{id}")
    public TurmaDTO buscaPorId(@PathVariable Long id) {
        return turmaService.buscaPorId(id);
    }
}
