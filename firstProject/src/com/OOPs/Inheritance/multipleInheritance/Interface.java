package com.OOPs.Inheritance.multipleInheritance;

public interface Interface {
	static int staticVar = 1;
	int i = 1;
//	static {
//		
//	}
	public static void staticMethod() {
		
	}
	int nonStatic = 2; // in interfrace java implicitly declare it as static and final
	
//	{
//		
//	}
	public void nonStaticMethod();
	public abstract void test();
}
