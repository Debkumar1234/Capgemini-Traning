package com.OOPs.Inheritance.Interface.looseCoupling;

public class Car {
	Engine engine;
	Car(Engine engine){
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}
