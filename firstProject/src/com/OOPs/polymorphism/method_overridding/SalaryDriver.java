package com.OOPs.polymorphism.method_overridding;



public class SalaryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		It it = new It();
		System.out.println(it.monthlySalCal((byte)6,2000));
		
		Supporting supporting = new Supporting();
		System.out.println(supporting.monthlySalCal((byte)6));
		
	}

}
