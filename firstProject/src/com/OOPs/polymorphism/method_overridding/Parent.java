package com.OOPs.polymorphism.method_overridding;

public class Parent {
	public void printStar() {
		System.out.println("*");
	}
	
	public void printStar(int num) {
		while(num-- > 0) {
			System.out.println("*");
		}
	}
}
