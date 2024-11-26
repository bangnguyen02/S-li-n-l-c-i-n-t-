package com.example.sodtu.repository;

import com.example.sodtu.model.Document;
import com.example.sodtu.model.ForumThread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IForumRepository extends JpaRepository<ForumThread, Integer> , JpaSpecificationExecutor<ForumThread> {
}
