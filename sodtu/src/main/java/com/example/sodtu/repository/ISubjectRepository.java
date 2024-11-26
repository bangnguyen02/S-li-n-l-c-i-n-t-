package com.example.sodtu.repository;

import com.example.sodtu.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
    Subject findByNameSubject(String subjectName);
}
