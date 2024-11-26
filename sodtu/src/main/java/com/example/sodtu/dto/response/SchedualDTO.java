package com.example.sodtu.dto.response;

import com.example.sodtu.model.Schedual;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchedualDTO {
    Integer id;
    String nameClass;
    String nameSubject;
    String nameTeacher;
    String dayOfWeek;
    LocalTime startTime;
    LocalTime endTime;
    String room;
    String semester;
    String academicYear;

    public SchedualDTO(Schedual schedual) {
        this.id = schedual.getId();
        this.nameClass = schedual.getClasses().getNameClass();
        this.nameSubject = schedual.getSubject().getNameSubject();
        this.nameTeacher = schedual.getTeacher().getFullname();
        this.dayOfWeek = schedual.getDayOfWeek().toString();
        this.startTime = schedual.getStartTime();
        this.endTime = schedual.getEndTime();
        this.room = schedual.getRoom();
        this.semester = schedual.getSemester();
        this.academicYear = schedual.getAcademicYear();
    }
}
