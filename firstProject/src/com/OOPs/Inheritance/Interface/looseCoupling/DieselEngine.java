package com.OOPs.Inheritance.Interface.looseCoupling;

public class DieselEngine implements Engine{
	String type = "Petrol";
	public void start() {
        System.out.println("Diesel engine started");
    }
}
