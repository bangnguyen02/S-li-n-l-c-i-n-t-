package com.example.sodtu.model;

import com.example.sodtu.enums.DayOfWeek;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "scheduals")
public class Schedual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Classes classes;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Subject subject;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User teacher;
    @Enumerated(EnumType.STRING)
    DayOfWeek dayOfWeek;
    LocalTime startTime;
    LocalTime endTime;
    String room;
    String semester;
    String academicYear;
}
