package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ProductMain {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em =emf.createEntityManager();
        //TypedQuery<Product> query = em.createQuery("select p from product p",Product.class);
        //TypedQuery<Object> q = em.create("select p.name,p.price,p.mfd from product p",Object.class);
        List<String> li = getresultList();
//        li.forEach(p->System.out.println(p[0]+"\t"+));
        TypedQuery<Product> q = em.createQuery("select p from product p where p.name like :p", Product.class);
        q.setParameter("p","L%");
        li.forEach(p->System.out.println(p));

    }
}
