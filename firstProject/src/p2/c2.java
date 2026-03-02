package p2;

import p1.c1;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		c1.m1();
		System.out.println("Start");
		varArgs();
		varArgs(1);
		varArgs(1,2,3);
		System.out.println("End");
		Day
	}
	public static void varArgs(double ...d) {
		for(int i = 0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}

}
