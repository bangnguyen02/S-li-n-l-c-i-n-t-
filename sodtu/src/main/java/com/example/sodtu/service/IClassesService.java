package com.example.sodtu.service;

import com.example.sodtu.dto.response.ClassesDTO;
import com.example.sodtu.model.Classes;

import java.util.List;

public interface IClassesService {
    List<ClassesDTO> getAllClass();
    Classes findByClassName(String className);
}
