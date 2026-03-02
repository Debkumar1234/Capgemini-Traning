package com.OOPs.polymorphism.method_overloading;

public class Calculator {
	public static void addition() {
		// base1
	}
//	public void addition() {
//		
//	}
	
	public static void addition(double op1, double op2) {
		// no of arguments
		//base2 (compare it with base1)
	}
	
	public static void addition(float op1, double op2) {
		// Change the dataType of arguments
		// base3 (compare it with base1)
	}
	
	public static void addition(double op1, float op2) {
		// change in order of DataType in args
		// base4 (compare it with base1)
	}
	
	public static void addition(double op1, char opr, double op2) {
		// change in order of DataType in args
		// base5 (compare it with base1)
	}
	
	public void say() {
		System.out.println("Hello World");
	}
	
	public void say(String name) {
		System.out.println("Hi "+name);
	}
	
	public void say(String name, String title) {
		System.out.println("Hi "+name+" "+title);
	}
}
