package com.example.sodtu.service.impl;

import com.example.sodtu.dto.response.DocumentDTO;
import com.example.sodtu.enums.DocumentType;
import com.example.sodtu.exception.ResourceNotFoundException;
import com.example.sodtu.model.Classes;
import com.example.sodtu.model.Document;
import com.example.sodtu.model.Subject;
import com.example.sodtu.model.User;
import com.example.sodtu.repository.IDocumentRepository;
import com.example.sodtu.service.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DocumentService implements IDocumentService {
    @Autowired
    private IDocumentRepository documentRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private ClassesService classesService;

    @Override
    public List<DocumentDTO> getAllDocuments() {
        return documentRepository.findAll().stream().map(DocumentDTO::new).collect(Collectors.toList());
    }

    @Override
    public DocumentDTO getDocumentById(Integer id) {
        return null;
    }

    @Override
    public DocumentDTO editDocument(Integer id, DocumentDTO documentDTO) {
        Document document = documentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Khong tim thay document"));
        User user = userService.getUserByUsername(documentDTO.getUploaderName());
        Subject subject = subjectService.getSubjectBySubjectName(documentDTO.getSubjectName());

        document.setTitle(documentDTO.getTitle());
        document.setDescription(documentDTO.getDescription());
        document.setGradeLevel(documentDTO.getGradeLevel());
        document.setFileType(documentDTO.getFileUrl());
        document.setFileType(documentDTO.getFileType());
        document.setFileSize(documentDTO.getFileSize());
        document.setUploader(user);
        document.setSubject(subject);
        document.setDocumentType(DocumentType.valueOf(documentDTO.getDocumentType()));
        document.setUploadDate(documentDTO.getUploadDate());

        return new DocumentDTO(document);
    }
}
