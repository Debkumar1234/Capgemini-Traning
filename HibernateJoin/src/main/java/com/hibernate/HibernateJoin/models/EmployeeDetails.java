package com.hibernate.HibernateJoin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeDetails {
	@Id
	private int id;
	private String mobile;
	private String email;
	private String address;
	
	@OneToOne(mappedBy = "employeeDetails")
	private Employee employee;
	
	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(int id, String mobile, String email, String address) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", mobile=" + mobile + ", email=" + email + ", address=" + address
				+ ", employee=" + employee + "]";
	}
	
}
