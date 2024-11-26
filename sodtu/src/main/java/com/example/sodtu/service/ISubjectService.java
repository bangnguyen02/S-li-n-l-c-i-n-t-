package com.example.sodtu.service;

import com.example.sodtu.model.Subject;

import java.util.List;

public interface ISubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectBySubjectName(String subjectName);
}
