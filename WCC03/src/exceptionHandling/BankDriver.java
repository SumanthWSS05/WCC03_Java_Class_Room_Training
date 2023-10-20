package exceptionHandling;

public class BankDriver {

	public static void main(String[] args) {
		System.out.println("main begins");
		Bank ref = new Bank();
		ref.withdraw(6000);
		System.out.println("main ends");
	}
}
