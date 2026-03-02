package com.OOPs.Inheritance;

public class FamilyDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child bachhe = new Child(12);
//		System.out.println(bachhe.age);
//		System.out.println(bachhe.gender);
//		System.out.println(bachhe.name);
		Parent p = new Child(23);
//		System.out.println(p.age);
//		System.out.println(p.gender);
//		System.out.println(p.name);
		System.out.println(bachhe.getClass());
		System.out.println(p.getClass());
		
	}

}
