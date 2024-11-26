package com.example.sodtu.repository;

import com.example.sodtu.model.Classes;
import com.example.sodtu.model.Schedual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISchedualRepository extends JpaRepository<Schedual, Integer> {
    List<Schedual> findAllByClassesIn(List<Classes> classes);
}
