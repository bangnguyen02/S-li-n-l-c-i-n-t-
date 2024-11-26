package com.example.sodtu.controller;

import com.example.sodtu.service.impl.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("")
    public ResponseEntity<?> getAllSubjects(){
        return ResponseEntity.ok(subjectService.getAllSubjects());
    }
}
