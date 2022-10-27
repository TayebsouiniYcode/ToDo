package com.example.todolistjakartaee9.service.implementation;

import com.example.todolistjakartaee9.entity.Users;
import com.example.todolistjakartaee9.repository.UserRepository;
import com.example.todolistjakartaee9.service.UsersService;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;

import java.util.ArrayList;

public class UsersServiceImp implements UsersService {
    UserRepository userReposiroty = new UserRepositoryImp ();

    @Override
    public int login(String email, String password) {
        return userReposiroty.login(email, password);
    }

    @Override
    public Users register ( String firstname , String lastname , String username , String password ) {
        System.out.println ("3" );
        Users user;
        System.out.println ("4" );
        user = userReposiroty.register(firstname, lastname, username, password);

        return null;
    }
}
