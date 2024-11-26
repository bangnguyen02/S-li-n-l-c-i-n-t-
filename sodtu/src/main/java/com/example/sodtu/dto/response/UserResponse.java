package com.example.sodtu.dto.response;

import com.example.sodtu.model.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    Integer id;
    String username;
    String fullname;
    String email;
    String phoneNumber;
    String avatar;
    Boolean active;
    LocalDate dob;
    String gender;
    String address;
    String role;

    public UserResponse(User user){
        setId(user.getId());
        setUsername(user.getUsername());
        setFullname(user.getFullname());
        setEmail(user.getEmail());
        setPhoneNumber(user.getPhoneNumber());
        setAvatar(user.getAvatar());
        setActive(user.getActive());
        setDob(user.getDob());
        setGender(user.getGender());
        setAddress(user.getAddress());
        setRole(user.getRole());
    }
}
