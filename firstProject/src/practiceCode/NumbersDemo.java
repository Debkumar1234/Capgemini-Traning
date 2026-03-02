package practiceCode;

import java.math.BigDecimal;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.1, b = 0.2;
		System.out.println("Double result: " + (float)(a+b));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal sum = bd1.add(bd2);
		System.out.println(sum);
		System.out.println(bd1);
	}

}
