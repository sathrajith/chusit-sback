package com.example.demo.service;



import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    List<String> getAllUserEmails();
}