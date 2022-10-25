package com.example.todolistjakartaee9.dao.implementation;

import com.example.todolistjakartaee9.dao.UserDAO;
import com.example.todolistjakartaee9.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAOImp implements UserDAO {

    @Override
    public Users add ( String firstname , String lastname , String username , String password ) {
        System.out.println ("7" );
        EntityManagerFactory emf;
        System.out.println ("7,5" );
        emf = Persistence.createEntityManagerFactory ( "todoPersistence" );
        System.out.println ("8" );
        EntityManager entityManager = emf.createEntityManager();
        System.out.println ("9" );

        Users user = new Users ();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUsername ( username );
        user.setPassword ( password );
        System.out.println ("10" );
        entityManager.getTransaction().begin();
        System.out.println ("11" );
        entityManager.persist ( user );
        System.out.println ("12" );
        entityManager.getTransaction().commit();
        System.out.println ("13" );
        entityManager.close ();
        System.out.println ("14" );
        emf.close ();
        System.out.println ("15" );

        return user;
    }
}
