package com.OOPs.polymorphism.method_overloading;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator calculator = new Calculator();
//		calculator.say();
//		calculator.say("Deb");
//		calculator.say("Deb","Mallick");
		Parent p = new Parent();
		Child c = new Child();
		p.printNum(0);
		c.printNum(0);
		c.printNum(0, 0);
	}

}
