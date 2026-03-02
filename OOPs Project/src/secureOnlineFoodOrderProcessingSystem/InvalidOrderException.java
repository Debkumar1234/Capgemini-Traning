package secureOnlineFoodOrderProcessingSystem;

public class InvalidOrderException extends Exception{
	InvalidOrderException(String msg){
		super(msg);
	}
}