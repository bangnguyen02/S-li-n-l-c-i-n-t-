package com.example.sodtu.service;

import com.example.sodtu.dto.response.GradeResponse;

import java.util.List;

public interface IGradeService {
    List<GradeResponse> getAllGradeByStudentId(Integer id);
}
