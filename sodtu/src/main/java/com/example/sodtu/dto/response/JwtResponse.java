package com.example.sodtu.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JwtResponse {
    String accessToken;
    UserResponse userResponse;
}
