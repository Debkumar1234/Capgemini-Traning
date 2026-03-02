package Exception.unchecked_exception;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
