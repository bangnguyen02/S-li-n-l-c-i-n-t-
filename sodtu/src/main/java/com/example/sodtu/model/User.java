package com.example.sodtu.model;

import com.example.sodtu.dto.request.RegisterRequest;
import com.example.sodtu.dto.request.UserRequest;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String username;
    String password;
    String fullname;
    String email;
    String phoneNumber;
    String avatar;
    String gender;
    LocalDate dob;
    String address;
    Boolean active;
    String role;
    public User(RegisterRequest registerRequest) {
        this.id = registerRequest.getId();
        this.username = registerRequest.getUsername();
        this.password = registerRequest.getPassword();
        this.fullname = registerRequest.getFullname();
        this.email = registerRequest.getEmail();
        this.phoneNumber = registerRequest.getPhoneNumber();
        this.gender = registerRequest.getGender();
        this.dob = registerRequest.getDob();
        this.address = registerRequest.getAddress();

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + this.role));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
