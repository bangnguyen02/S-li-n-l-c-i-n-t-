package com.example.sodtu.service.impl;

import com.example.sodtu.dto.response.ForumDTO;
import com.example.sodtu.model.ForumThread;
import com.example.sodtu.repository.IForumRepository;
import com.example.sodtu.service.IForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ForumService implements IForumService {
    @Autowired
    private IForumRepository forumRepository;

    @Override
    public Page<ForumDTO> getFilterForum(Pageable pageable, String category, String sort) {
        Specification<ForumThread> spec = Specification.where(null);

        if (category != null && !category.isEmpty()) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("category").get("name"), category));
        }

        Sort sortOption = Sort.by(Sort.Direction.DESC, "createdAt");
        if ("mostCommented".equals(sort)) {
            sortOption = Sort.by(Sort.Direction.DESC, "commentCount");
        } else if ("mostViewed".equals(sort)) {
            sortOption = Sort.by(Sort.Direction.DESC, "viewCount");
        }
        Pageable sortedPageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sortOption);
        return forumRepository.findAll(spec, sortedPageable).map(ForumDTO::new);
    }
}
