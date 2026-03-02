package firstProject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true, flag1 = true;
		
		do {
			int num1,num2;
			char choice,ch;
			System.out.println("Enter first operand : ");
			num1 = sc.nextInt();
			sc.nextLine();
			int result = num1;
			do {
				System.out.println("Which operation do you want : 1) 1 for addition 2) 2 for substraction 3) 3 for multiplication 4) 4 for division");
				choice = sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Enter another operand : ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
				case '1':
					result = sum(result,num2);
					break;
				case '2':
					result = sub(result,num2);
					break;
				case '3':
					result = mul(result,num2);
					break;
				case '4':
					result = div(result,num2);
					break;
				default:
					System.out.println("You entered wrong input");
					break;
				}
				System.out.println("do you want to continue the same calculation, then press y : ");
				ch = sc.next().charAt(0);
				if(ch != 'y') {
					System.out.println("----EXIT----");
					flag = !flag;
				}
			}while(flag);
			System.out.println("Result is : "+result);
			System.out.println("you want another calculation, then press y : ");
			char ch1 = sc.next().charAt(0);
			if(ch1 != 'y') {
				System.out.println("----EXIT----");
				flag1 = !flag1;
				sc.close();
			}
		}while(flag1);
		
		System.exit(0);
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	public static int sub(int n1, int n2) {
		return n1-n2;
	}
	public static int div(int n1, int n2) {
		return n1/n2;
	}
	public static int mul(int n1, int n2) {
		return n1*n2;
	}
	

}
