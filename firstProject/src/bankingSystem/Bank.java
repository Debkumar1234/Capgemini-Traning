package bankingSystem;

public class Bank {
	public BankAccount createAccount(String type, String name, int amount, int pin) {
		int min = 1000;
		int max = 9000;
		int randomInt = (int) (Math.random() * (max - min + 1) + min);
		BankAccount newAccount;
		if(type.equals("Savings")) {
			newAccount = new SavingsAccount(randomInt, name, amount, pin);
		}else {
			newAccount = new CurrentAccount(randomInt, name, amount, pin);
		}
		System.out.println("Bank accoun created successfully.");
		return newAccount;
	}
}
