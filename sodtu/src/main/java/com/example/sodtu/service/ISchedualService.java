package com.example.sodtu.service;

import com.example.sodtu.dto.response.SchedualDTO;
import com.example.sodtu.model.User;

import java.util.List;

public interface ISchedualService {
    List<SchedualDTO> getAllSchedules();
    List<SchedualDTO> getAllScheduals(User user);
    SchedualDTO getSchedualById(Integer id);
}
