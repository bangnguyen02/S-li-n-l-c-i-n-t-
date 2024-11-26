package com.example.sodtu.controller;

import com.example.sodtu.model.User;
import com.example.sodtu.service.impl.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/schedual")
@RestController
@CrossOrigin("*")
public class SchedualController {
    @Autowired
    private SchedualService schedualService;
    @GetMapping("")
    public ResponseEntity<?> getAllScheduals(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(schedualService.getAllScheduals(user));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getSchedualById(@RequestParam Integer id){
        return ResponseEntity.ok(schedualService.getSchedualById(id));
    }
}
