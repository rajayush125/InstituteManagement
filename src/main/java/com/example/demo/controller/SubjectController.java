package com.example.demo.controller;

import com.example.demo.entity.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
        return new ResponseEntity<>(subjectService.addSubject(subject), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable Long id,@RequestBody Subject subject){
        return new ResponseEntity<>(subjectService.updateSubject(id,subject),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Subject> deleteSubject(@PathVariable Long id){
        subjectService.deleteSubject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects(){
        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);

    }

}
