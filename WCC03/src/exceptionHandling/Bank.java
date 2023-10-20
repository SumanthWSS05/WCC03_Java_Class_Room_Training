package exceptionHandling;

public class Bank {

	double balance = 5000;
	
	public void withdraw(double amount) {
		System.out.println("withdraw process begins");
		if(amount < balance) {
			
		}else {
			throw new InvalidAmountException("Entere amount is grerater than balance");
		}
		System.out.println("withdraw process ends");
	}
	
	public void transfer() {
		throw new InvalidAmountException();
	}
}

