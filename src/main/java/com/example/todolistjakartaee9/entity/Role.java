package com.example.todolistjakartaee9.entity;

public class Role {
    private int id;
    private String roleName;

    public int getId ( ) {
        return id;
    }

    public String getRoleName ( ) {
        return roleName;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public void setRoleName ( String roleName ) {
        this.roleName = roleName;
    }

    @Override
    public String toString ( ) {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}