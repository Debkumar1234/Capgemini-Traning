package practiceCode;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		userInput.nextLine();
		int len = 0;
		int temp = number;
		while(temp>0) {
			len+=1;
			temp /= 10;
		}
		temp = number;
		int sum = 0;
		while(temp>0) {
			int digit = temp%10;
			sum += Math.pow(digit, len);
			temp /= 10;
		}
		if(sum==number) {
			System.out.println("It is a amstrong number");
		}else {
			System.out.println("It is not a amstrong number");
		}
		userInput.close();
	}

}
