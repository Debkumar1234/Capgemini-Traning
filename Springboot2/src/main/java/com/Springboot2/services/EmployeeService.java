package com.Springboot2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot2.model.Employee;
import com.Springboot2.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public List<Employee> display() {
		return employeeRepo.findAll();
	}

	public Employee findById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	public void deleteById(int id) {
		employeeRepo.deleteById(id);
	}
	
	public Employee updateEmployee(int id, String name) {
		Employee em = employeeRepo.findById(id).orElse(null);
		em.setName(name);
		return em;
	}
}
