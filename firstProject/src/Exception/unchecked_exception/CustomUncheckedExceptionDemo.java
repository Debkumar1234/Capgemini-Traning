package Exception.unchecked_exception;

public class CustomUncheckedExceptionDemo {
	public static void withdraw(double balance, double amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("Withdrawal amount exceeds the available balance!");
		}
		System.out.println("Withdrawal successful! Remaining Balance: "+(balance - amount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 5000;
		double withdrawAmount = 4000;
		
		try {
			withdraw(balance, withdrawAmount);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}

}
