package com.example.sodtu.service;

import com.example.sodtu.model.Notification;

import java.util.List;

public interface INotificationService {
    List<Notification> getAllNotification();
    List<Notification> getNotificationsByType(String type);
}
