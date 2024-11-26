package com.example.sodtu.service;

import com.example.sodtu.dto.response.DocumentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IDocumentService {
    List<DocumentDTO> getAllDocuments();
    DocumentDTO getDocumentById(Integer id);
    DocumentDTO editDocument(Integer id, DocumentDTO documentDTO);
}
