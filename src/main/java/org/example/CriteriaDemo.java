package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Root;

public class CriteriaDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = cb.createQuery();
        CreateQuery<Product> cq = cb.createQuery(Produc t.class);
        Root<Product> cq = cb.createQuery(Product.class);
        List<product> r = cq.from(Product.class);

    }
}
