package com.example.sodtu.controller;

import com.example.sodtu.dto.response.DocumentDTO;
import com.example.sodtu.service.impl.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/document")
public class DocumentController {
    @Autowired
    private DocumentService documentService;
    @GetMapping("")
    public ResponseEntity<?> getAllDocuments(){
        List<DocumentDTO> documents = documentService.getAllDocuments();
        return ResponseEntity.ok(documents);
    }
}
