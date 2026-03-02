package SecureDigitalWalletTransactionEngine;

public class InvalidPinException extends RuntimeException{
	public InvalidPinException(String msg) {
		super(msg);
	}
}
