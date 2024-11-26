package com.example.sodtu.controller;

import com.example.sodtu.dto.request.UserRequest;
import com.example.sodtu.mapper.IUserMapper;
import com.example.sodtu.model.User;
import com.example.sodtu.service.AuthenticationService;
import com.example.sodtu.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private IUserMapper userMapper;
    @GetMapping("/info")
    public ResponseEntity<?> getInfoUser(Authentication authentication){
        User user = (User) authentication.getPrincipal();
        return ResponseEntity.ok(userMapper.toUserResponse(user));
    }

    @PutMapping("/info")
    public ResponseEntity<?> editInfoUser(@RequestBody UserRequest userRequest, Authentication authentication){
        User user = (User) authentication.getPrincipal();

        user.setFullname(userRequest.getFullname());
        user.setAddress(userRequest.getAddress());
        user.setDob(userRequest.getDob());
        user.setEmail(userRequest.getEmail());
        user.setGender(userRequest.getGender());
        user.setPhoneNumber(userRequest.getPhoneNumber());

        User updateUser = userService.updateUser(user);
        return ResponseEntity.ok(userMapper.toUserResponse(updateUser));
    }
}
