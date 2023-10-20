package collectionMethod;

import java.util.Iterator;
import java.util.LinkedList;

public class P6 {

	//adding two linkedList
	public static void main(String[] args) {
		
		LinkedList bag1 = new LinkedList();
		bag1.add("Britania");
		bag1.add("Oreo");
		bag1.add("Parle-G");
		
		LinkedList bag2 = new LinkedList();
		bag2.add("Eclairs");
		bag2.add("Dairy Milk");
		bag2.add("Milky Bar");
		bag2.add("Munch");
		bag2.add("Perk");
		
		LinkedList bag3 = new LinkedList(bag1);
		System.out.println(bag3);
		System.out.println("==============================");
		bag3.addAll(bag2);
		System.out.println(bag3);
		
		Iterator i = bag3.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
