package com.example.sodtu.service.impl;

import com.example.sodtu.dto.response.ClassesDTO;
import com.example.sodtu.model.Classes;
import com.example.sodtu.repository.IClassesRepository;
import com.example.sodtu.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassesService implements IClassesService {
    @Autowired
    private IClassesRepository classesRepository;
    @Override
    public List<ClassesDTO> getAllClass() {
        return classesRepository.findAll()
                .stream()
                .map(ClassesDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public Classes findByClassName(String className) {
        return classesRepository.findByNameClass(className);
    }
}
