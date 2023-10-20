package exceptionHandling;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Main begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total cost");
		double cost = sc.nextDouble();
		System.out.println("Enter the total number of products");
		int prod = sc.nextInt();
		ProductRepo ref = new ProductRepo();
		try {
			ref.costPerPiece(cost, prod);
		}catch(ArithmeticException e) {
			System.out.println("no of products cannot be zero");
		}
		System.out.println("Thank you...!!!!");
		System.out.println("Main ends");
	}
}
