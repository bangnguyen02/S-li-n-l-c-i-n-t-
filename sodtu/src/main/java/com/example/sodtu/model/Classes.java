package com.example.sodtu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nameClass;
    String academicYear;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    School school;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User teacher;

    @ManyToMany
    @JoinTable(
            name = "class_students",
            joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
    )
    Set<User> students = new HashSet<>();
}
