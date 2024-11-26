package com.example.sodtu.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "forum_threads")
public class ForumThread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String content;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    Category category;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User author;
    @Column(name = "comment_count")
    Integer commentCount = 0;
    Boolean pinned = false;
    LocalDateTime createdAt;
}
