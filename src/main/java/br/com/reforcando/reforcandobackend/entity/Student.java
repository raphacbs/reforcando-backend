package br.com.reforcando.reforcandobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, columnDefinition = "character varying default 'sem escola'")
    private String schoolName;
    @Column(nullable = false, columnDefinition = "character varying default 'sem serie'")
    private String schoolClassroom;
    @Column(nullable = false, columnDefinition = "double precision default 70.0")
    private double monthlyFee;
    @Column(nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false)
    private LocalDateTime createAt;
    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean active;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "parentId")
    private Parent parent;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroomId")
    private Classroom classroom;
}
