package com.example.sodtu.repository;

import com.example.sodtu.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotificationRepository extends JpaRepository<Notification, Integer> {
    List<Notification> findAllByType(String type);
}
