package com.example.sodtu.repository;

import com.example.sodtu.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findAllByStudentId(Integer id);
}
