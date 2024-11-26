package com.example.sodtu.service.impl;

import com.example.sodtu.dto.response.SchedualDTO;
import com.example.sodtu.model.Classes;
import com.example.sodtu.model.Schedual;
import com.example.sodtu.model.User;
import com.example.sodtu.repository.IClassesRepository;
import com.example.sodtu.repository.ISchedualRepository;
import com.example.sodtu.service.ISchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchedualService implements ISchedualService {
    @Autowired
    private ISchedualRepository schedualRepository;
    @Autowired
    private IClassesRepository classesRepository;

    @Override
    public List<SchedualDTO> getAllSchedules() {
        List<Schedual> scheduals = schedualRepository.findAll();
        return scheduals.stream()
                .map(SchedualDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<SchedualDTO> getAllScheduals(User user) {
        List<Classes> classes = classesRepository.findAllByStudents(user);
        List<Schedual> scheduals = schedualRepository.findAllByClassesIn(classes);

        return scheduals
                .stream()
                .map(SchedualDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public SchedualDTO getSchedualById(Integer id) {
        Schedual schedual = schedualRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy lịch học với ID: "+id));
        return new  SchedualDTO(schedual);
    }
}
