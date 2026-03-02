package com.OOPs.var_shadow_hide.shadowing;

class Test{
	int x = 10;
	static int y = 30;
	void show() {
		int x = 10;
		int y = 40;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(Test.y);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Test test = new Test();
		test.show();
	}

}
