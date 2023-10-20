package collectionMethod;

import java.util.TreeSet;

public class S3 {

	public static void main(String[] args) {
		
		TreeSet ref = new TreeSet();   //homogeneous
		ref.add("Shubhra");  	//it should be of comparable type
		ref.add("Kalpana");
		ref.add("Hema");
		ref.add("Mohini");
		ref.add("Priyanka");
		ref.add("Radhika");
		ref.add("Shubhra");
		ref.add("Hemalatha");
		ref.add("Kiran");
		ref.add("Kirngh");
		
		System.out.println(ref);		
	}

}
