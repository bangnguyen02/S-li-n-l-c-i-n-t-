package com.example.sodtu.controller;

import com.example.sodtu.model.User;
import com.example.sodtu.service.impl.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @GetMapping("")
    public ResponseEntity<?> getAllGradeByUser(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(gradeService.getAllGradeByStudentId(user.getId()));
    }
}
