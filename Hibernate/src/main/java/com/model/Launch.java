package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Employee e = new Employee(1, "deb",  "deb@gmail.com", "1234567890");
		
		s.save(e);
		
		Employee e1 = s.get(Employee.class, 2);
		System.out.println(e1);
//		s.delete(e1);
		s.remove(e1);
		System.out.println("deleted successfully");
		
		
		Transaction t = s.beginTransaction();
		
		t.commit();
	}

}
