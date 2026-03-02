package bankingSystem;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(int accNum, String name, int balance, int pin) {
		super(accNum, name, balance, pin, "Savings");
		System.out.println("Savings Account created.");
	}


}
