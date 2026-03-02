package com.OOPs.polymorphism.method_overridding;

public class It extends Employee{
	double varPay = 200000;
	
//	@Override  // using this annotation we can verify the method is override or not
	public double monthlySalCal(byte durationInMonths, int bonus) {
		return (((basePay+varPay)/12)*durationInMonths)+bonus;
	}
	
}
