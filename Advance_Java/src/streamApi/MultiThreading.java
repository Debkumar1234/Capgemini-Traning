package streamApi;

import java.util.Scanner;

class D1 extends Thread{
	@Override
	public void run() {
		System.out.println("Program Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		System.out.println("Program finished");
	}
}

class D2 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing Characters");
		for(int i = 65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D3 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing Characters");
		for(int i = 0;i<=10;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 t1 = new D1();
		D2 t2 = new D2();
		D3 t3 = new D3();
//		t1.run();
//		t2.run();// run method work as sequencial 
//		t3.run();
		t1.start();
		t2.start(); // start method work as 
		t3.start();
	}

}
