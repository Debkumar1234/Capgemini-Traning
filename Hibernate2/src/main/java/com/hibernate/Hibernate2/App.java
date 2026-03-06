package com.hibernate.Hibernate2;

import java.util.List;

import com.hibernate.Hibernate2.models.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

//		Customer e = new Customer("deb", "1234567890");
//		Customer e1 = new Customer("one", "1234567891");
//		Customer e2 = new Customer("two", "1234567892");
//		Customer e3 = new Customer("three", "1234567893");
//		Customer e4 = new Customer("four", "1234567894");
		/* Insert row */
//		em.persist(e);
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(e4);
		
		/* Delete row */
//		Customer customerToDelete = em.find(Customer.class, 1); // find by primary id
//		if(customerToDelete != null) {
//			em.remove(customerToDelete);
//			System.out.println("Deleted Successfully");
//		}
		/* Update row */
		Customer customerToUpdate = em.find(Customer.class, 2); // find by primary id
		if(customerToUpdate != null) {
			customerToUpdate.setName("oneUpdated");
			System.out.println("Updated Successfully");
		}
		
		
		Query query = em.createQuery("Select c from Customer c");
		List<Customer> list = query.getResultList();
		
		for(Customer c : list) {
			System.out.println(c);
		}
		
//		List<Customer> list = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
//
//		for (Customer c : list) {
//			System.out.println(c);
//		}

//		Customer e1 = em.ge
//		System.out.println(e1);
//		s.delete(e1);
//		s.remove(e1);
//		System.out.println("deleted successfully");
		et.commit();
	}
}
