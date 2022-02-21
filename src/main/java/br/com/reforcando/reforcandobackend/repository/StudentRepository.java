package br.com.reforcando.reforcandobackend.repository;

import br.com.reforcando.reforcandobackend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByClassroomId(Long classroomId);
}
