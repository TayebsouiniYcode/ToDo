package com.example.todolistjakartaee9.service;

import com.example.todolistjakartaee9.entity.Users;

import java.util.ArrayList;

public interface UsersService {
    int login(Users user);
    Users register(Users user);
}
