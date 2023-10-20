package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			
		try {
			System.out.println("enter the value a");
			int a = sc.nextInt();
			System.out.println("a is " +a);
			System.out.println("enter the value b");
			int b = sc.nextInt();
			System.out.println("b is "+ b);
			int res = a/b;
			System.out.println("a/b is " + res);
		}catch(InputMismatchException e) {
			System.out.println("please enter a number");
		}catch(ArithmeticException e) {
			System.out.println("b value cannot be zero");
		}
		System.out.println("Thank you");
		
		P7.readDataFromExternalFile();
	}
}
