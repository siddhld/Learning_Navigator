package com.crio.learning_navigator.service;

import com.crio.learning_navigator.model.Exam;

import java.util.List;

public interface ExamService {
    Exam createExam(Exam exam);
    List<Exam> getAllExams();
    Exam getExamById(Long id);
}