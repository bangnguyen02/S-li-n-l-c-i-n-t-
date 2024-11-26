package com.example.sodtu.service.impl;

import com.example.sodtu.dto.response.GradeResponse;
import com.example.sodtu.model.Grade;
import com.example.sodtu.repository.IGradeRepository;
import com.example.sodtu.service.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService implements IGradeService {
    @Autowired
    private IGradeRepository gradeRepository;
    @Override
    public List<GradeResponse> getAllGradeByStudentId(Integer id) {
        List<Grade> grades = gradeRepository.findAllByStudentId(id);
        return grades
                .stream()
                .map(GradeResponse::new)
                .collect(Collectors.toList());
    }
}
