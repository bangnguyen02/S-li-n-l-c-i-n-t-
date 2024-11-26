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
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User sender;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(referencedColumnName = "id")
    User receiver;
    String title;
    String content;
    @Column(name = "is_read")
    Boolean isRead = false;
    LocalDateTime sentAt;
    LocalDateTime readAt;
}
