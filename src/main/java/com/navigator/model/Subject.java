package com.navigator.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Table(name = "subjects")
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "enrolledSubjects")
    private Set<Student> registeredStudents;
}