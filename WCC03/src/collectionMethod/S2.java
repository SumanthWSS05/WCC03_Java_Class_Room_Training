package collectionMethod;

import java.util.LinkedHashSet;

public class S2 {

	public static void main(String[] args) {
		
		LinkedHashSet ref = new LinkedHashSet();
		ref.add(true);   //null   100   200
		ref.add(new Book("C",300)); //100   200  300
		ref.add(34);  //200   300   null
		ref.add("Hello");
		ref.add('f');
		
		ref.add("Hello");
		ref.add(false);
		ref.add('f');
		
		System.out.println(ref);
		
		for(Object o : ref) {
			System.out.println(o);
		}
	}
}
