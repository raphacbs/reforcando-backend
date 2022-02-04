package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    public List<Classroom> findByDescription(String description);
}
