package com.OOPs.polymorphism.method_overridding;

public class Supporting extends Employee {
	double varPay = 100000;

	// Override
	public double monthlySalCal(byte durationInMonths) {
		return (int)(basePay + varPay) / 12;
	}
}
