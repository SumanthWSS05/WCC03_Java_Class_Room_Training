package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P5 {

	public static void main(String[] args) {

		try {
			System.out.println("Stmt 1");
			FileInputStream ref = new FileInputStream("");
			System.out.println("Stmt 2");
			int a = 1 / 0;
			System.out.println("Stmt 3");
			System.out.println(a);
			System.out.println("Stmt 4");
			P1 obj = null;
			System.out.println("Stmt 5");
			obj.toString();

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {

		} catch (FileNotFoundException e) {
			System.out.println("File path is wrong");
		} catch (IOException e) {
			
		}

	}
}
