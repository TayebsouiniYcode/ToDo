package com.example.todolistjakartaee9.dao.implementation;

import com.example.todolistjakartaee9.dao.UserDAO;
import com.example.todolistjakartaee9.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAOImp implements UserDAO {

    @Override
    public Users add ( String firstname , String lastname , String username , String password ) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory ( "todoPersistence" );
        EntityManager entityManager = emf.createEntityManager();

        Users user = new Users ();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUsername ( username );
        user.setPassword ( password );

        try {
            entityManager.getTransaction().begin();
            entityManager.persist ( user );
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction ().rollback ();
        } finally {
            entityManager.close ();
            emf.close ();
            return user;
        }
    }
}
