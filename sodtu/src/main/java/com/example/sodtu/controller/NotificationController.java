package com.example.sodtu.controller;

import com.example.sodtu.service.impl.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @GetMapping("")
    public ResponseEntity<?> getAllNotification(@RequestParam(required = false)String type){
        if (type != null) {
            return ResponseEntity.ok(notificationService.getNotificationsByType(type));
        }
        return ResponseEntity.ok(notificationService.getAllNotification());
    }
}
