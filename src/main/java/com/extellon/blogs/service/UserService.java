package com.extellon.blogs.service;


import com.extellon.blogs.dto.RegistrationDto;
import com.extellon.blogs.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
