package com.example.todolistjakartaee9.repository.implementation;

import com.example.todolistjakartaee9.dao.UserDAO;
import com.example.todolistjakartaee9.entity.Users;
import com.example.todolistjakartaee9.repository.UserRepository;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;
import java.util.ArrayList;

import com.example.todolistjakartaee9.dao.implementation.UserDAOImp;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;
import jakarta.websocket.Session;


// -------------------------------------------

// --------------------------------------------

public class UserRepositoryImp implements UserRepository {
    UserDAO userDAO = new UserDAOImp ();

    @Override
    public int login(Users user) {
        findByUsername(user.getUsername ());
        return 0;
    }

    @Override
    public int findByUsername ( String username ) {
        return 1;
    }

    @Override
    public Users register ( Users user ) {
        return userDAO.add(user);
    }



    @Override
    public Users findByEmail ( String email ) {
        return null;
    }
}
