package com.OOPs.Inheritance.car_factory;

import java.util.Scanner;

public class CarFactoryDriver {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("Which engine to fit?");
		System.out.println("1. Petrol Engine");
		System.out.println("2. Diesel Engine");
		System.out.println("Enter your choice : ");
		byte userChoice = userInput.nextByte();
		userInput.nextLine();
		Engine engine = null;
		
		switch (userChoice) {
		case 1: 
			PetrolEngine petrolEngine = new PetrolEngine();
			engine = petrolEngine;
			break;
		case 2:
			DieselEngine dieselEngine = new DieselEngine();
			engine = dieselEngine;
			break;
		default:
			PetrolEngine petrolEngine1 = new PetrolEngine();
			engine = petrolEngine1;
			break;
		}
		car.engine = engine;
		
		System.out.println("Engine in car : "+ car.engine);
	}

}
