package com.example.todolistjakartaee9.dao.implementation;

import com.example.todolistjakartaee9.dao.UserDAO;
import com.example.todolistjakartaee9.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAOImp implements UserDAO {

    @Override
    public Users add ( Users user ) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory ( "todoPersistence" );
        EntityManager entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist ( user );
            entityManager.getTransaction().commit();

            entityManager.close ();
            emf.close ();
            return user;
    }
}
