package com.example.demo.service;
import com.example.demo.entity.Subject;
import java.util.List;

public interface SubjectService {
    Subject addSubject(Subject subject);
    Subject updateSubject(Long id, Subject subject);
    void deleteSubject(Long id);
    List<Subject> getAllSubjects();

}

