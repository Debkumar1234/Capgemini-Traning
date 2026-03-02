package SecureDigitalWalletTransactionEngine;

import bankingSystem.InvalidAmountException;

public class BasicWallet extends DigitalWallet{
	BasicWallet(String walletId, String name, int pin, double initialBalance) throws InvalidAmountException {
		super(walletId, name, pin, initialBalance);
	}
	BasicWallet(String walletId, String name, int pin) throws InvalidAmountException {
		super(walletId, name, pin);
	}
	@Override
	public double getTransactionFee() {
		// TODO Auto-generated method stub
		return 10;
	}
}
