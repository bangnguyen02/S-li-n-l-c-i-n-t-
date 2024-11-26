package com.example.sodtu.dto.response;

import com.example.sodtu.model.Grade;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GradeResponse {
    Integer id;
    Double score;
    String semester;
    String academicYear;
    String comment;
    String gradeType;
    String nameStudent;
    String nameSubject;
    String nameClass;

    public GradeResponse(Grade grade){
        this.id = grade.getId();
        this.score = grade.getScore();
        this.semester = grade.getSemester();
        this.academicYear = grade.getAcademicYear();
        this.comment = grade.getComment();
        this.gradeType = grade.getGradeType().toString();
        this.nameStudent = grade.getStudent().getFullname();
        this.nameSubject = grade.getSubject().getNameSubject();
        this.nameClass = grade.getClasses().getNameClass();
    }
}
