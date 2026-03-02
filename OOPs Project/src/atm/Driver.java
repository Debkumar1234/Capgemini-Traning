package atm;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Account acc = new Account(1234);
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		
		while(acc.getLimit()>0) {
			System.out.println("Enter pin : ");
			int pin = sc.nextInt();
			try {
				acc.withdraw(pin);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Okay you can leave");
		
		
	}

}
