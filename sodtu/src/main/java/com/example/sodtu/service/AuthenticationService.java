package com.example.sodtu.service;

import com.example.sodtu.dto.request.RegisterRequest;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.mapper.IUserMapper;
import com.example.sodtu.model.User;
import com.example.sodtu.repository.IUserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class AuthenticationService {
    @Autowired
    IUserRepository userRepository;
    @Autowired
    IUserMapper userMapper;
    public UserResponse createUser(RegisterRequest request){
        User user = new User(request);
        user.setActive(true);
        user.setRole("USER");
        userRepository.save(user);
        return userMapper.toUserResponse(user);
    }
    public UserResponse findUserByUsername(String username){
        User user = userRepository.findUserByUsername(username);
        return userMapper.toUserResponse(user);
    }
}
