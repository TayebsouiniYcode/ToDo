package com.example.todolistjakartaee9.controller;

import com.example.todolistjakartaee9.service.UsersService;
import com.example.todolistjakartaee9.service.implementation.UsersServiceImp;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import com.example.todolistjakartaee9.entity.Users;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    UsersService userService = new UsersServiceImp ();
    @Override
    protected void doGet ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        request.getRequestDispatcher ( "register.jsp" ).forward ( request, response );

    }

    @Override
    protected void doPost ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        System.out.println ("1" );
        String firstname = request.getParameter ( "firstname" );
        String lastname = request.getParameter ( "lastname" );
        String username = request.getParameter ( "username");
        String password = request.getParameter ( "password");
        System.out.println ("2" );
        userService.register(firstname, lastname, username, password);

        //System.out.println ("Firstname: " + firstname + " lastname: " + lastname + " username :  " + username + "" +
        //        "password " + password);
    }
}
