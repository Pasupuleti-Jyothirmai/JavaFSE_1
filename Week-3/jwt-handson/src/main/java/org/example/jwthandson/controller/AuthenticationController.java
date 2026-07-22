package org.example.jwthandson.controller;

import org.example.jwthandson.model.AuthenticationRequest;
import org.example.jwthandson.model.AuthenticationResponse;
import org.example.jwthandson.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}