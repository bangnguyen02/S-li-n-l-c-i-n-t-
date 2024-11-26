package com.example.sodtu.service;

import com.example.sodtu.dto.request.UserRequest;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.model.User;

import java.util.List;

public interface IUserService {
    List<UserResponse> getAllUser();
    List<UserResponse> deleteUser(Integer id);
    User getUserByUsername(String username);
    UserResponse updateUserById(Integer id, UserRequest userRequest);
    User updateUser(User user);
}
