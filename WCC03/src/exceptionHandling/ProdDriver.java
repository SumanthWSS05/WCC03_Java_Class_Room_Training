package exceptionHandling;

import java.util.Scanner;

public class ProdDriver {

	public static void main(String[] args) {
		
		Product ref = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total cost");
		int cost = sc.nextInt();
		System.out.println("Enter total no of products");
		int noOfProd = sc.nextInt();
		double price = ref.calculateUnitPriceOfProduct(cost,noOfProd,sc);
		if(price==0)
			System.out.println("Invalid num of products");
		else
			System.out.println("Cost of one product is : "+ price);
	}
}
