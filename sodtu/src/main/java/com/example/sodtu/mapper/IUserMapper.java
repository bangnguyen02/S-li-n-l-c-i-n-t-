package com.example.sodtu.mapper;

import com.example.sodtu.dto.request.RegisterRequest;
import com.example.sodtu.dto.request.UserRequest;
import com.example.sodtu.dto.response.UserResponse;
import com.example.sodtu.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IUserMapper {
    UserResponse toUserResponse(User user);
}
