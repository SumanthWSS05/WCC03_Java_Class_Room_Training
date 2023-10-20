package collectionMethod;

import java.util.LinkedList;

public class P8 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Java", 3999);
		Book b2 = new Book("Python",2499);
		Book b3 = new Book("C", 2399);
		Book b4 = new Book("C#", 3299);
		
		
		LinkedList bag1 = new LinkedList();
		bag1.add(b1);
		bag1.add(b2);
		bag1.add(b3);
		bag1.add(b4);
		
		LinkedList bag2 = new LinkedList();
		bag2.add(b1);
		bag2.add(b3);
		
		LinkedList bag3 = new LinkedList(bag1);
		bag3.removeAll(bag2);
		
		System.out.println(bag3);
	}
}
