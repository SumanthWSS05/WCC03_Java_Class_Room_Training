package collectionMethod;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class S1 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Java",249);
		Book b2 = b1;
		HashSet ref = new HashSet();
		ref.add(23);
		ref.add(67);
		ref.add(45);
		ref.add(77);
		ref.add(33);
		
		ref.add(77);
//		ref.add(b1);
//		ref.add(b2);
		
		System.out.println(ref.size());
		Iterator it = ref.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
