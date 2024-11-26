package com.example.sodtu.dto.response;

import com.example.sodtu.model.Classes;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassesDTO {
    Integer id;
    String nameClass;
    String academicYear;
    String school;
    String teacher;
    public ClassesDTO(Classes classes){
        setId(classes.getId());
        setNameClass(classes.getNameClass());
        setAcademicYear(classes.getNameClass());
        setSchool(classes.getSchool().getNameSchool());
        setTeacher(classes.getTeacher().getFullname());
    }
}
