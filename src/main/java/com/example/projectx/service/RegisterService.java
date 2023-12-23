package com.example.projectx.service;

import com.example.projectx.dto.User;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    public User Register(User user){
    user.setName(user.getName());
    user.setSurname(user.getSurname());
    user.setEmail(user.getEmail());
    user.setPassword(user.getPassword());
    user.setAddress(user.getAddress());
    user.setPesel(user.getPesel());
    user.setPhoneNumber(user.getPhoneNumber());
    return user;
    }
}
