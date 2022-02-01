package br.com.reforcando.reforcandobackend.service;

import br.com.reforcando.reforcandobackend.dto.MessageResponseDTO;
import br.com.reforcando.reforcandobackend.dto.TurmaDTO;
import br.com.reforcando.reforcandobackend.entity.Turma;
import br.com.reforcando.reforcandobackend.mapper.TurmaMapper;
import br.com.reforcando.reforcandobackend.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;
    private final TurmaMapper turmaMapper = TurmaMapper.INSTANCE;

    @Autowired
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public MessageResponseDTO cadastra(TurmaDTO turmaDTO) {
        Turma turmaParaSalvar = turmaMapper.toModel(turmaDTO);
        Turma turmaSalva = this.turmaRepository.save(turmaParaSalvar);
        return MessageResponseDTO.builder()
                .message(String.format("Turma cadastrada com o ID: %s", turmaSalva.getId()))
                .build();
    }


    public TurmaDTO buscaPorId(Long id) {
        Optional<Turma> optionalTurma = turmaRepository.findById(id);
        return turmaMapper.toDTO(optionalTurma.orElse(null));
    }
}
