package practiceCode;

import java.math.BigDecimal;
import java.util.Currency;

public class CurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency inr = Currency.getInstance("INR");
		Currency usd = Currency.getInstance("USD");
		
		System.out.println("INR Code: " + inr.getCurrencyCode());
		System.out.println("USD Symbol: " + usd.getSymbol());
		
		BigDecimal amount = new BigDecimal("125000.75");
		
		Number
	}

}
