package collectionMethod;

import java.util.ArrayList;

public class Bag {

	public static void main(String[] args) {
		
		Book b1 = new Book("JAVA", 3999);
		Book b2 = new Book("Python", 2499);
		Book b3 = new Book("C", 3495);
		Book b4 = new Book("C#", 3798);
		
		ArrayList bag1 = new ArrayList();  //bag1 homogeneous
		bag1.add(b1);
		bag1.add(b2);
		bag1.add(b3);
		bag1.add(b4);
		
		ArrayList bag2 = new ArrayList();
		bag2.add(b1);
		bag2.add(b3);
		
		String bookToSearch = "JavaScript";
		int count = 0;
		for( Object o : bag1) {
			Book b = (Book)o;  //downcasting
			if(b.name.equalsIgnoreCase(bookToSearch)) {
				System.out.println("The book you are searching for is present in the Bag");
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Sorry the book you are searching is not in the bag");
	}

}
