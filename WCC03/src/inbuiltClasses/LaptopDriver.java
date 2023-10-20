package inbuiltClasses;

public class LaptopDriver { //extends Object  12 method

	 
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("HP", 8, 1, "I7");
		
		Laptop l2 = new Laptop("HP", 8, 1, "I7");
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		
		System.out.println(l1.equals(l2));
		
	}

}
