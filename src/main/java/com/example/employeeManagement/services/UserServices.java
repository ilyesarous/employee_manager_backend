package com.example.employeeManagement.services;

import com.example.employeeManagement.entities.User;
import com.example.employeeManagement.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServices /*implements UserDetailsService*/ {

    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }
    public String login(User user) {
        if (userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()).isPresent()) {
            return "logged in successfully";
        }
        return "Error!";
    }
    public String signUp(User user) {
        if (userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()).isPresent()) {
            return "user already exists!";
        }
        userRepository.save(user);
        return "user created successfully!";
    }
//TODO: orbot authentification bl security
    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsernameOrEmail(username, username);
        if(user.isEmpty()){
            throw new UsernameNotFoundException("User not exists by Username");
        }

        return new org.springframework.security.core.userdetails.User(username,user.get().getPassword());

    }*/
}
