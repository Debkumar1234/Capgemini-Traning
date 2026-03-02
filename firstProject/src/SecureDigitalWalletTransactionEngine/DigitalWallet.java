package SecureDigitalWalletTransactionEngine;

import bankingSystem.InvalidAmountException;

public abstract class DigitalWallet {
	private final String walletId;
	private final String name;
	private double balance;
	private int pin;

	DigitalWallet(String walletId, String name, int pin, double initialBalance) throws InvalidAmountException {
		if (initialBalance < 0) {
			throw new InvalidAmountException("Initial balance cannot be negative");
		}
		this.walletId = walletId;
		this.name = name;
		this.pin = pin;
		this.balance = initialBalance;
	}

	DigitalWallet(String walletId, String name, int pin) throws InvalidAmountException {
		this(walletId, name, pin, 0);
//		this.walletId = walletId;
//		this.name = name;
//		this.pin = pin;
//		this.balance = 0;
	}

	public String getWalletId(int pin) {
		return walletId;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void credit(double money) throws InvalidAmountException {
		if (money <= 0) {
			throw new InvalidAmountException("Initial balance cannot be negative");
		}
		this.balance += money;
	}

	public void addMoney(double money) throws InvalidAmountException {
		if (money <= 0) {
			throw new InvalidAmountException("Amount must be positive");
		}
		credit(money);
	}

	public void addMoney(double money, String source) throws InvalidAmountException {
		if (money <= 0) {
			throw new InvalidAmountException("Amount must be positive");
		}
		// source = UPI / CARD (no switch needed)
		credit(money);
	}

	public void withdraw(int pin, double amount) {
		if (this.pin == pin) {
			if (amount > this.balance) {
				throw new InsufficientBalanceException("Insufficient balance");
			}
			this.balance -= amount;
		} else {
			throw new InvalidPinException("Pin does not match");
		}
	}

	// Abstract behavior (runtime polymorphism)
	public abstract double getTransactionFee();
}
