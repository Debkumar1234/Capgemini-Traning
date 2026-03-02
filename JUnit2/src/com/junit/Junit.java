package com.junit;

public class Junit {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}
	
	public int[] array() {
		int[] arr = {1, 2, 3, 4};
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 3, 4};
		return arr1;
	}
}
