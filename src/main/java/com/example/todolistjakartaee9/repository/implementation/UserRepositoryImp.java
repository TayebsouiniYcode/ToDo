package com.example.todolistjakartaee9.repository.implementation;

import com.example.todolistjakartaee9.dao.UserDAO;
import com.example.todolistjakartaee9.entity.Users;
import com.example.todolistjakartaee9.repository.UserRepository;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;
import java.util.ArrayList;

import com.example.todolistjakartaee9.dao.implementation.UserDAOImp;
import com.example.todolistjakartaee9.repository.implementation.UserRepositoryImp;


// -------------------------------------------

// --------------------------------------------

public class UserRepositoryImp implements UserRepository {
    UserDAO userDAO = new UserDAOImp ();

    @Override
    public int login(String email, String password) {
        Users user = new UserRepositoryImp ().findByEmail(email);
        System.out.println ( );
        return  (user.getPassword().equals(password)) ? 1 : 2;
    }

    @Override
    public Users register ( String firstname , String lastname , String username , String password ) {
        System.out.println ("5" );
        Users user;
        System.out.println ("6" );
        user = userDAO.add(firstname, lastname, username, password);
        return user;
    }

    @Override
    public Users findByEmail ( String email ) {
        return null;
    }
}
