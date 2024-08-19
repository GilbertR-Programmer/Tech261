package com.sparta.grr.securitypractice.controllers;

import com.sparta.grr.securitypractice.dtos.UserDto;
import com.sparta.grr.securitypractice.models.User;
import com.sparta.grr.securitypractice.repositories.UserRepository;
import com.sparta.grr.securitypractice.security.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logins")
public class UserController {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    private final JwtTokenService jwtTokenService;

    @Autowired
    public UserController(UserRepository userRepository,
                          PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, JwtTokenService jwtTokenService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtTokenService = jwtTokenService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDto request) {
        if (userRepository.findByUserName(request.getUserName()).isPresent()) {
            return "Username already exists!";
        }

        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(request.getRole().toUpperCase());

        userRepository.save(user);
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto request) {
        System.out.println("ahhhhhhhhhhhhhhhh");
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
        );

        String token = jwtTokenService.generateToken(authentication.getName(), request.getRole());

        return ResponseEntity.ok(token);
    }
}