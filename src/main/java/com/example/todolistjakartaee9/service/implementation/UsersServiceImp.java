package com.example.todolistjakartaee9.service.implementation;

import com.example.todolistjakartaee9.entity.Users;
import com.example.todolistjakartaee9.repository.UserRepository;
import com.example.todolistjakartaee9.service.UsersService;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;

import java.util.ArrayList;

public class UsersServiceImp implements UsersService {
    UserRepository userReposiroty = new UserRepositoryImp ();

    @Override
    public int login(Users user){
        return userReposiroty.login ( user );
    }

    @Override
    public Users register ( Users user ) {
        return userReposiroty.register(user);
    }
}
