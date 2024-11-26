package com.example.sodtu.repository;

import com.example.sodtu.model.Classes;
import com.example.sodtu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClassesRepository extends JpaRepository<Classes, Integer> {
    List<Classes> findAllByStudents(User student);

    Classes findByNameClass(String className);
}
