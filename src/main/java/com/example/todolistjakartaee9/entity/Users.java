package com.example.todolistjakartaee9.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "firstname doesn't take a null value")
    @Column(name = "firstname")
    private String firstname;

    @NotNull(message = "last_name doesn't take a null value")
    @Column(name = "lastname")
    private String lastname;



    @Column(unique = true, nullable = false)
    @NotNull(message = "username doesn't take a null value")
    private String username;

    @NotNull(message = "password doesn't take a null value")
    @Column(name = "password")
    private String password;



    public Users() {}
    public Users ( String firstname , String lastname , String email , String phone , String username , String password ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public long getId ( ) {
        return id;
    }

    public String getFirstname ( ) {
        return firstname;
    }

    public String getLastname ( ) {
        return lastname;
    }


    public String getUsername ( ) {
        return username;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setId ( long id ) {
        this.id = id;
    }

    public void setFirstname ( String firstname ) {
        this.firstname = firstname;
    }

    public void setLastname ( String lastname ) {
        this.lastname = lastname;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    @Override
    public String toString ( ) {
        return "Users{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
