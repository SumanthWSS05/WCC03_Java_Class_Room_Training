package exceptionHandling;

public class P8 {

	public static void main(String[] args) {

		System.out.println("main begins");
		int a = 100;
		int b = 20;
		try {
			int res = a / b;
			System.out.println(res);
		} finally {   //some set of instruction to be executed if there 
			System.out.println("There was a exception");
			System.out.println("closing all the connections which is in opened state");
			System.out.println("Successfully closed all open points");
			System.out.println("Thank you");
		}
		System.out.println("after try and finally block");
		System.out.println("main ends");
	}
}
