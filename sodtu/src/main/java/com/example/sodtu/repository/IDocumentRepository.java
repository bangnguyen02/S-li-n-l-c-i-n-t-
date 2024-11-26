package com.example.sodtu.repository;

import com.example.sodtu.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentRepository extends JpaRepository<Document, Integer>{
}
