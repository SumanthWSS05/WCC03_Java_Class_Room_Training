package exceptionHandling;

import java.util.Scanner;

public class Product {

	public int calculateUnitPriceOfProduct(int totalCost, int noOfProducts, Scanner sc) {
		int costPerPiece = 0;
		int count = 1;
		
		for (;;) {
			try {
				costPerPiece = totalCost / noOfProducts;
				break;
			} catch (ArithmeticException e) {
				System.out.println("Enter the valid num of products");
				noOfProducts = sc.nextInt();
				count++;
				if (!(count < 3)) {
					System.out.println("Sorry you have 3 invalid attempts please try after some time");
					break;
				}
			}
		}
		return costPerPiece;
	}
}
