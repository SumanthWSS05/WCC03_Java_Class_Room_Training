package collectionMethod;

import java.util.Collections;
import java.util.LinkedList;

public class P9 {

	public static void main(String[] args) {

		LinkedList<Book> bag1 = new LinkedList<>();   //-> generic and non-generic
		bag1.add(new Book("Java", 3999));    
		bag1.add(new Book("Python", 2499));    
		bag1.add(new Book("C", 2399));
		bag1.add(new Book("C#", 3299));
//		bag1.add(new Boooks());
		
		Collections.sort(bag1);
		System.out.println(bag1);   //it should give address of collection
									//toString of LinkedList is overridden
		
		bag1.remove("Java");

		LinkedList bag2 = new LinkedList();
		bag2.add(new Book("Java", 3999));
		bag2.add(new Book("C", 2399));
		bag2.add(new Book("C#",3299));

		LinkedList bag3 = new LinkedList(bag1);
		System.out.println(bag3);

		for (int i = 0; i < bag3.size(); i++) {
			Book book = (Book) bag3.get(i);
			for(int j=0 ; j< bag2.size(); j++) {
				Book bag2book = (Book) bag2.get(j);
				if (book.name.equalsIgnoreCase(bag2book.name)) {
					bag3.remove(book);
				}
			}
		}

		System.out.println(bag3);
	}
}
