package com.example.sodtu.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    Integer id;
    String username;
    String fullname;
    String email;
    String phoneNumber;
    String gender;
    String address;
    LocalDate dob;
    String avatar;

}
