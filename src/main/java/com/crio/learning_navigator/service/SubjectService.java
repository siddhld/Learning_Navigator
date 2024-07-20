package com.crio.learning_navigator.service;

import com.crio.learning_navigator.model.Subject;
import java.util.List;

public interface SubjectService {
    Subject createSubject(Subject subject);
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}