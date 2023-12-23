package com.example.projectx.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    @Email(message = "Put correct email adress")
    private String email;
    @NotBlank
    @Size(min = 8,max = 32)
    private String password;
    @NotBlank
    @Size(min = 9,max = 9)
    private String phoneNumber;
    @NotBlank
    private String pesel;
    @NotBlank
    private String address;

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getPesel(){
        return pesel;
    }
    public String getAddress(){
        return address;
    }
}
