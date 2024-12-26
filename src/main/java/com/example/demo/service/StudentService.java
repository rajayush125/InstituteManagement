package com.example.demo.service;
import com.example.demo.entity.Student;
import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudents();
    }

