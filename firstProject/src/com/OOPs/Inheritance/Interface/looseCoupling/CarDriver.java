package com.OOPs.Inheritance.Interface.looseCoupling;

public class CarDriver {
	public static void main(String[] args) { // In loose Coupling we can fit any engine without changing the logic inside Car engine.
		Car car1 = new Car(new PetrolEngine());
		car1.drive();
		Car car2 = new Car(new DieselEngine());
		car2.drive();
	}
}
