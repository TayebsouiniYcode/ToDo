package com.example.todolistjakartaee9.dao;

import com.example.todolistjakartaee9.entity.Users;

import java.util.ArrayList;

public interface UserDAO {
    Users add(String firstname, String lastname, String username, String password);
}
