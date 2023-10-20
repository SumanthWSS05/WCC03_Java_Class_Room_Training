package exceptionHandling;

public class P4 {

	public static void main(String[] args) {
		System.out.println("main begins");
		int a = 10;
		System.out.println("a is : " +a);
		int b = 0;
		System.out.println("b is : " +b);
		try {
			int res = a/b;   //AE 
			System.out.println("a/b is : "+ res);
		}catch(NullPointerException e) {
			   
		}		
		System.out.println("main ends");
	}
}
