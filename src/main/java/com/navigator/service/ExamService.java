package com.navigator.service;

import com.navigator.model.Exam;
import java.util.List;

public interface ExamService {
    Exam createExam(Exam exam);
    List<Exam> getAllExams();
    Exam getExamById(Long id);
}