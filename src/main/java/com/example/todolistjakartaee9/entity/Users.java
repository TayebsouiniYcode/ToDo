package com.example.todolistjakartaee9.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

//import org.hibernate.annotations.DynamicUpdate;

import com.example.todolistjakartaee9.entity.Role;


@Entity
//@DynamicUpdate
@Table(schema = "public", name = "Users")
public class Users {

    @NotNull
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "email doesn't take a null value")
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    //private Role role;


    public String getFirstname ( ) {
        return firstname;
    }

    public String getLastname ( ) {
        return lastname;
    }

    public int getId ( ) {
        return id;
    }

    public String getUsername ( ) {
        return username;
    }

    public String getPassword ( ) {
        return password;
    }
/*
    public Role getRole() {
        return role;
    }
*/
    public void setId ( int id ) {
        this.id = id;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public void setFirstname ( String firstname ) {
        this.firstname = firstname;
    }

    public void setLastname ( String lastname ) {
        this.lastname = lastname;
    }
    /*
    public void setRole(Role role) {
        this.role = role;
    }*/
/*
    @Override
    public String toString ( ) {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
    */
}
