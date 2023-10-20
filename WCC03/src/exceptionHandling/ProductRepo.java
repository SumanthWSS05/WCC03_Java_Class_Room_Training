package exceptionHandling;

public class ProductRepo {

	public void costPerPiece(double totalCost, int noOfProd) {
		System.out.println("calculation begins");
		int costPerPiece = ((int) totalCost) / noOfProd;
		System.out.println("Cost per piece is " + costPerPiece);
		System.out.println("calculation ends");
	}
}
