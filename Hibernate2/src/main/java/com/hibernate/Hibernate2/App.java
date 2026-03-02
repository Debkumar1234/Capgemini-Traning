package com.hibernate.Hibernate2;

import java.util.List;

import com.hibernate.Hibernate2.models.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Customer e = new Customer("deb", "1234567890");

//		em.persist(e);

		List<Customer> list = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();

		for (Customer c : list) {
			System.out.println(c);
		}

//		Customer e1 = em.ge
//		System.out.println(e1);
//		s.delete(e1);
//		s.remove(e1);
//		System.out.println("deleted successfully");
		et.commit();
	}
}
