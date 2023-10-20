package exceptionHandling;

public class InvalidAmountException extends RuntimeException {

	public InvalidAmountException() {
		super("Insufficient funds");
	}
	
	public InvalidAmountException(String message) {
		super(message);
	}
}
