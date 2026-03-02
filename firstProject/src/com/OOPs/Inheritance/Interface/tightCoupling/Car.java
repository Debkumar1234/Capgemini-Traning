package com.OOPs.Inheritance.Interface.tightCoupling;

public class Car {
	PetrolEngine engine;
	Car(){
		engine = new PetrolEngine();
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}
