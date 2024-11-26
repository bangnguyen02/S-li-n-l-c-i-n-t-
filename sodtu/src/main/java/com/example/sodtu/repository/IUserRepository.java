package com.example.sodtu.repository;

import com.example.sodtu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
    Boolean existsUserByUsername(String username);
}
