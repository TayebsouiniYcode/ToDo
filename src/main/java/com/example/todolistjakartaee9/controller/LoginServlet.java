package com.example.todolistjakartaee9.controller;

import com.example.todolistjakartaee9.entity.Users;
import com.example.todolistjakartaee9.service.UsersService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import com.example.todolistjakartaee9.service.implementation.UsersServiceImp;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    UsersService userService;

    public void init() {
        userService = new UsersServiceImp ();
    }

    @Override
    protected void doGet ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {

    }

    @Override
    protected void doPost ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        String username = request.getParameter ( "username" );
        String password = request.getParameter ( "password" );

        System.out.println ("username : " + username + " password : "  + password);

        Users user = new Users ();

        user.setUsername ( username );
        user.setPassword ( password );

        if (userService.login (user) == 1 ) {
            System.out.println ("connect" );
        }else {
            System.out.println ("user not found" );
        }

        System.out.println (user.toString () );

    }
}
