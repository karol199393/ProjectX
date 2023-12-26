package com.example.projectx.controller;

import com.example.projectx.dto.User;
import com.example.projectx.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    RegisterService registerService;

    RegisterController(RegisterService registerService){
        this.registerService=registerService;
    }
    @PostMapping("/register")
    public User register(@RequestBody User user){
        registerService.register(user);
        return user;
    }
}
