package com.example.projectx.dto;

public interface Validate {
    public void validateName(String name);
    public void validateSurname(String surname);
    public void validateEmail(String email);
    public void validatePassword(String password);
    public void validatePhoneNumber(String password);
    public void validatePesel(String pesel);
    public void validateAddress(String address);

}
