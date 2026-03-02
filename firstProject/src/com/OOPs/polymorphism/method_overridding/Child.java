package com.OOPs.polymorphism.method_overridding;

import java.util.Scanner;

public class Child extends Parent{
	@Override
	public void printStar() {
		System.out.println("Enter star count");
		Scanner userInput = new Scanner(System.in);
		int starCount = userInput.nextInt();
		userInput.nextLine();
		userInput.close();
		for(int i = 0;i<starCount;i++) {
			System.out.println("*");
		}
	}
}
