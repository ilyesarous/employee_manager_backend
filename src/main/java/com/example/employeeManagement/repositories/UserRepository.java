package com.example.employeeManagement.repositories;

import com.example.employeeManagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmailAndPassword(String e, String p);
    Optional<User> findByUsernameOrEmail(String username, String email);

}
