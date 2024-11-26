package com.example.sodtu.dto.response;

import com.example.sodtu.model.ForumThread;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ForumDTO {
    Integer id;
    String title;
    String content;
    String category;
    String author;
    Integer commentCount = 0;
    Boolean pinned = false;
    LocalDateTime createdAt;
    public ForumDTO(ForumThread forumThread){
        this.id = forumThread.getId();
        this.title = forumThread.getTitle();
        this.content = forumThread.getContent();
        this.category = forumThread.getCategory().getName();
        this.author = forumThread.getAuthor().getFullname();
        this.commentCount = forumThread.getCommentCount();
        this.pinned = forumThread.getPinned();
        this.createdAt = forumThread.getCreatedAt();
    }
}
