package com.example.sodtu.service;

import com.example.sodtu.dto.response.ForumDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IForumService {
    Page<ForumDTO> getFilterForum(Pageable pageable, String category, String sort);
}
