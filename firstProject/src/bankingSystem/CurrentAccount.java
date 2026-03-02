package bankingSystem;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(int accNum, String name, int balance, int pin) {
		super(accNum, name, balance, pin, "Current");
		System.out.println("Current Account created.");
	}


}
