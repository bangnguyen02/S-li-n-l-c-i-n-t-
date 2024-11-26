package com.example.sodtu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String content;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    ForumThread thread;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User author;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Comment parentComment;
    Boolean edited = false;
}
