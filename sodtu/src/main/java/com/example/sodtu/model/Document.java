package com.example.sodtu.model;

import com.example.sodtu.enums.DocumentType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    String title;
    String description;
    String gradeLevel;
    @Column(nullable = false)
    String fileUrl;
    String fileType;
    Integer fileSize;
    @Enumerated(EnumType.STRING)
    DocumentType documentType;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User uploader;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Subject subject;
    @Column(name = "upload_date")
    LocalDateTime uploadDate;
}
