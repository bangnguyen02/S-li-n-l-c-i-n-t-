package com.example.sodtu.service.impl;

import com.example.sodtu.dto.request.UserRequest;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.exception.ResourceNotFoundException;
import com.example.sodtu.mapper.IUserMapper;
import com.example.sodtu.model.User;
import com.example.sodtu.repository.IUserRepository;
import com.example.sodtu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<UserResponse> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserResponse> deleteUser(Integer id) {
        userRepository.deleteById(id);
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public UserResponse updateUserById(Integer id, UserRequest userRequest) {
        User user =  userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));

        user.setFullname(userRequest.getFullname());
        user.setEmail(userRequest.getEmail());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setAvatar(userRequest.getAvatar());
        user.setDob(userRequest.getDob());
        user.setGender(userRequest.getGender());
        user.setAddress(userRequest.getAddress());

        userRepository.save(user);
        return new UserResponse(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
