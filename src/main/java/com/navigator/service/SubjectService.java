package com.navigator.service;

import com.navigator.model.Subject;
import java.util.List;

public interface SubjectService {
    Subject createSubject(Subject subject);
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}