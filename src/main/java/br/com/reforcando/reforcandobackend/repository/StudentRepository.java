package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
