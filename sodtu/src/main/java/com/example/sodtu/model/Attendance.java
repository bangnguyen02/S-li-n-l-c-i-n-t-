package com.example.sodtu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "attendaces")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User students;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Classes classes;
    @Column(name = "attendance_date")
    LocalDate date;
    Boolean present;
    String reason;
    String note;
}
