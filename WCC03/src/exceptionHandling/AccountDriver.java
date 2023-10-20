package exceptionHandling;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account ref = new Account();
		AccountSavings reff = (AccountSavings) ref;
		
		System.out.println(reff.accountNum);
		System.out.println(reff.accountName);
		System.out.println(reff.balance);
	}

}
