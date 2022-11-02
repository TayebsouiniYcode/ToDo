package com.example.todolistjakartaee9.repository;

import com.example.todolistjakartaee9.entity.Users;

import java.util.ArrayList;

public interface UserRepository {
    int login(Users user);
    int findByUsername(String username);
    Users register(Users user);
    Users findByEmail(String email);
}
