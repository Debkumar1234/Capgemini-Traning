package SecureDigitalWalletTransactionEngine;

import bankingSystem.InvalidAmountException;

public class WalletApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            DigitalWallet w1 = new BasicWallet("W101", "Deb", 1234, 1000);
            DigitalWallet w2 = new PremiumWallet("W202", "Alex", 1235, 500);

            w1.addMoney(-500, "UPI");

            System.out.println("W1 Balance: " + w1.getBalance());
            System.out.println("W2 Balance: " + w2.getBalance());

        }catch (InvalidAmountException e) {
        	System.out.println("Runtime Exception: " + e.getMessage());
		}catch (InvalidPinException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }catch (InsufficientBalanceException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }  finally {
            System.out.println("Transaction attempt completed");
        }
	}

}
