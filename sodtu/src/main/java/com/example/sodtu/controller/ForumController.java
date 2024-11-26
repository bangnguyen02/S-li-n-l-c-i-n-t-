package com.example.sodtu.controller;

import com.example.sodtu.service.impl.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/forum")
public class ForumController {
    @Autowired
    private ForumService forumService;
    @GetMapping("")
    public ResponseEntity<?> getAllForum(@RequestParam(defaultValue = "0") Integer page,
                                         @RequestParam(defaultValue = "3") Integer size,
                                         @RequestParam(required = false) String category,
                                         @RequestParam(defaultValue = "newest") String sort){
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(forumService.getFilterForum(pageable, category, sort));
    }
}
