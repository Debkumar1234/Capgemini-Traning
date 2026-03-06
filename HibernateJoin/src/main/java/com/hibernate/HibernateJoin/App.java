package com.hibernate.HibernateJoin;

import com.hibernate.HibernateJoin.models.Employee;
import com.hibernate.HibernateJoin.models.EmployeeDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        Employee e1 = new Employee(1, "zero");
        EmployeeDetails ed1 = new EmployeeDetails(101, "1234", "abc@gmail.com", "ABCD Road");
        
        e1.setEmployeeDetails(ed1);
        ed1.setEmployee(e1);
        
        em.persist(e1);
        
        et.commit();
    }
}
