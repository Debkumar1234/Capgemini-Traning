package com.Springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot2.model.Employee;
import com.Springboot2.services.EmployeeService;

@RestController /* It is the combination of Controller and ResponseBody */
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee save(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	@GetMapping("/display")
	public List<Employee> display() {
		return employeeService.display();
	}
	
	@GetMapping("/getById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findById(id);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		employeeService.deleteById(id);
		return "Deleted successfully";
	}
	@PatchMapping("/update/{id}/{name}")
	public Employee updateById(@PathVariable int id,@PathVariable String name) {
		return employeeService.updateEmployee(id, name);
	}
}
