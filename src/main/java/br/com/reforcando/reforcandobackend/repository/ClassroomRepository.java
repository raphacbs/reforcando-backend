package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
