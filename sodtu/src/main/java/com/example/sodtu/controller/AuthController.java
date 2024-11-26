package com.example.sodtu.controller;

import com.example.sodtu.dto.request.LoginRequest;
import com.example.sodtu.dto.request.RegisterRequest;
import com.example.sodtu.dto.response.JwtResponse;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.security.JwtUtil;
import com.example.sodtu.service.AuthenticationService;
import com.example.sodtu.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("*")
@RequestMapping("/api/auth")
@RestController
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private CustomUserDetailsService userDetailsService;
    @Autowired
    private AuthenticationService authenticationService;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        request.setPassword(passwordEncoder.encode(request.getPassword()));
        return ResponseEntity.ok(authenticationService.createUser(request));
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        UserResponse user;
        try {
            user = authenticationService.findUserByUsername(loginRequest.getUsername());
        } catch (UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Sai ten dang nhap");
        }

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
        } catch (BadCredentialsException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Sai mat khau");
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Authentication failed",e);
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
        String token = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token, user));
    }
}
