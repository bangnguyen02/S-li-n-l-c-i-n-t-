package com.example.sodtu.service.impl;

import com.example.sodtu.model.Notification;
import com.example.sodtu.repository.INotificationRepository;
import com.example.sodtu.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements INotificationService {
    @Autowired
    private INotificationRepository notificationRepository;
    @Override
    public List<Notification> getAllNotification() {
        return notificationRepository.findAll();
    }

    @Override
    public List<Notification> getNotificationsByType(String type) {
        return notificationRepository.findAllByType(type);
    }
}
