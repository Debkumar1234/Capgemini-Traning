package com.OOPs.Inheritance.Interface.looseCoupling;

public class PetrolEngine implements Engine{
	String type = "Petrol";
	public void start() {
        System.out.println("Petrol engine started");
    }
}
