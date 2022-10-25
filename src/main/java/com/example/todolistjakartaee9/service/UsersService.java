package com.example.todolistjakartaee9.service;

import com.example.todolistjakartaee9.entity.Users;

import java.util.ArrayList;

public interface UsersService {
    int login(String email, String password);
    Users register(String firstname, String lastname, String username, String password);
}
