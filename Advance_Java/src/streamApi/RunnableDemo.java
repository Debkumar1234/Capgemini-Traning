package streamApi;

import java.util.Scanner;

class D4 implements Runnable{
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

class D5 implements Runnable{
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

class D6 implements Runnable{
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

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D4 d1 = new D4();
		D5 d2 = new D5();
		D6 d3 = new D6();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
//		t1.run();
//		t2.run();// run method work as sequencial 
//		t3.run();
		t1.start();
		t2.start(); // start method work as 
		t3.start();
	}

}
