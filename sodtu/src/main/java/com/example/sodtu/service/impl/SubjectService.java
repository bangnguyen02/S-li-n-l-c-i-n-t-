package com.example.sodtu.service.impl;

import com.example.sodtu.model.Subject;
import com.example.sodtu.repository.ISubjectRepository;
import com.example.sodtu.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private ISubjectRepository subjectRepository;
    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectBySubjectName(String subjectName) {
        return subjectRepository.findByNameSubject(subjectName);
    }
}
