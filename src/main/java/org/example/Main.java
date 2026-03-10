package org.example;

import jakarta.persistence.*;
import org.example.PEmployee;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        PEmployee obj = new PEmployee();
        obj.setName("Luv");
        obj.setDob(LocalDate.of(2002, 7, 13));
        obj.setSalary(95000);

        em.persist(obj);

        em.getTransaction().commit();

        System.out.println("Created...");
    }
}