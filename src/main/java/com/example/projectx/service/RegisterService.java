package com.example.projectx.service;

import com.example.projectx.dto.User;
import com.example.projectx.validator.Validator;
import org.springframework.stereotype.Service;

@Service
public class RegisterService extends Validator {

    public User register(User user) {
        validateName(user.getName());
        user.setName(user.getName());
        validateSurname(user.getSurname());
        user.setSurname(user.getSurname());
        validateEmail(user.getEmail());
        user.setEmail(user.getEmail());
        validatePassword(user.getPassword());
        user.setPassword(user.getPassword());
        validatePhoneNumber(user.getPhoneNumber());
        user.setPhoneNumber(user.getPhoneNumber());
        validatePesel(user.getPesel());
        user.setPesel(user.getPesel());
        validateAddress(user.getAddress());
        user.setAddress(user.getAddress());
        return user;
    }

    public void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Field name can't be empty!");
        }
    }

    public void validateSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Field surname can't be empty!");
        }
    }

    public void validateEmail(String email) {
        if(email == null || email.isEmpty() || !email.contains("@") || !email.matches(".+@.+\\..{2,}")) {
            throw new IllegalArgumentException("Invalid format email");
        }
    }

    public void validatePassword(String password) {
        if(password == null || password.isEmpty() ||password.length()<8)
            throw new IllegalArgumentException("Field password can't be empty and must be at least 8 character long");
    }

    public void validatePhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.isEmpty() || !phoneNumber.matches("[0-9]+"))
            throw new IllegalArgumentException("Field phone number can't be empty and must contain only digits");
    }

    public void validatePesel(String pesel) {
        if(pesel == null || pesel.isEmpty() || pesel.length() == 9)
            throw new IllegalArgumentException("Field pesel can't be empty and must be 9 digits!");
    }

    public void validateAddress(String address) {
        if(address == null || address.isEmpty())
            throw new IllegalArgumentException("Field address can't be empty!");

    }
}
