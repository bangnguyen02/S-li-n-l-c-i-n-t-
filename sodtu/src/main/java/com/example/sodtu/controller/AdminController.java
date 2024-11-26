package com.example.sodtu.controller;

import com.example.sodtu.dto.request.UserRequest;
import com.example.sodtu.dto.response.DocumentDTO;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/teacher")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private ClassesService classesService;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private SchedualService schedualService;
    @GetMapping("/user")
    public ResponseEntity<?> getAllUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        return ResponseEntity.ok(userService.deleteUser(id));
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<?> editUser(@PathVariable Integer id, @RequestBody UserRequest userRequest){
        UserResponse userResponse = userService.updateUserById(id, userRequest);
        return ResponseEntity.ok(userResponse);
    }
    @GetMapping("/document")
    public ResponseEntity<?> getAllDocument(){
        return ResponseEntity.ok(documentService.getAllDocuments());
    }
    @PutMapping("/document/{id}")
    public ResponseEntity<?> editDocument(@PathVariable Integer id, @RequestBody DocumentDTO documentDTO){
        return ResponseEntity.ok(documentService.editDocument(id, documentDTO));
    }
    @GetMapping("/classes")
    public ResponseEntity<?> getAllClasses(){
        return ResponseEntity.ok(classesService.getAllClass());
    }
    @GetMapping("/subject")
    public ResponseEntity<?> getAllSubject(){
        return ResponseEntity.ok(subjectService.getAllSubjects());
    }
    @GetMapping("/schedule")
    public ResponseEntity<?> getAllSchedule(){
        return ResponseEntity.ok(schedualService.getAllSchedules());
    }
}
