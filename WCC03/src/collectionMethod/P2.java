package collectionMethod;

import java.util.ArrayList;

public class P2 {

	public static void main(String[] args) {
		
		ArrayList ref = new ArrayList();
		ref.add(10);
		ref.add(34);
		ref.add(78);
		ref.add(33);
		ref.add(88);
		ref.add(12);
		
		System.out.println("Size of ArrayList is : "+ref.size());
		System.out.println("4th element is : " + ref.get(4));
		System.out.println("Removing the element : " +ref.remove(3));
		System.out.println("Updated size is : " +ref.size());
		ref.add(2, 77);
		System.out.println("after addign element in position 3 is : " +ref.size());
		
		System.out.println(ref);
	}

}
