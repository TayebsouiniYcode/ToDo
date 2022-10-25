package com.example.todolistjakartaee9.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import com.example.todolistjakartaee9.service.implementation.UsersServiceImp;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private UsersServiceImp userServiceImp;

    public void init() {
        userServiceImp = new UsersServiceImp ();
    }

    @Override
    protected void doGet ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {

    }

    @Override
    protected void doPost ( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (userServiceImp.login(username, password) == 1) {
            System.out.println ("true" );
            /*int id = new UsersServiceImp ().findByEmail(username).getUserId();
            HttpSession session = request.getSession();
            session.setAttribute("id" , id );

            response.sendRedirect("/login");*/
        } else {
            System.out.println ("false" );
            /*RequestDispatcher requestDispatcher =request.getRequestDispatcher("login.jsp");
            requestDispatcher.include(request,response);
            response.sendRedirect("/");*/
        }
    }
}
