package com.example.sodtu.dto.response;

import com.example.sodtu.model.Document;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DocumentDTO {
    Integer id;
    String title;
    String description;
    String gradeLevel;
    String fileUrl;
    String fileType;
    Integer fileSize;
    String uploaderName;
    String subjectName;
    String className;
    String documentType;
    LocalDateTime uploadDate;
    public DocumentDTO(Document document){
        this.id = document.getId();
        this.title = document.getTitle();
        this.description = document.getDescription();
        this.fileUrl = document.getFileUrl();
        this.fileType = document.getFileType();
        this.fileSize = document.getFileSize();
        this.gradeLevel = document.getGradeLevel();
        this.documentType = document.getDocumentType().toString();
        this.uploaderName = document.getUploader().getFullname();
        this.subjectName = document.getSubject().getNameSubject();
        this.uploadDate = document.getUploadDate();
    }
}
