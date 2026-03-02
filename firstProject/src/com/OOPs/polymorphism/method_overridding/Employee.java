package com.OOPs.polymorphism.method_overridding;

public class Employee {
	double basePay = 300000;
	
	public double monthlySalCal(byte durationInMonths) {
		return (basePay/12)*durationInMonths;
	}
}
