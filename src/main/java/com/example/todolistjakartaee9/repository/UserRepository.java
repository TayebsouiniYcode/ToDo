package com.example.todolistjakartaee9.repository;

import com.example.todolistjakartaee9.entity.Users;

import java.util.ArrayList;

public interface UserRepository {
    int login(String email, String password);
    Users register(String firstname, String lastname, String username, String password);
    Users findByEmail(String email);
}
