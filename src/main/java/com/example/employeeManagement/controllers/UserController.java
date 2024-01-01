package com.example.employeeManagement.controllers;

import com.example.employeeManagement.entities.User;
import com.example.employeeManagement.services.UserServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private UserServices userServices;
    @GetMapping
    public List<User> getAllUsers(){
        return userServices.getAll();
    }
    @PostMapping("/login")
    public String login(@Valid @RequestBody User user){
        return userServices.login(user);
    }
    @PostMapping("/signup")
    public String signUp(@Valid @RequestBody User user){
        return userServices.signUp(user);
    }


}
