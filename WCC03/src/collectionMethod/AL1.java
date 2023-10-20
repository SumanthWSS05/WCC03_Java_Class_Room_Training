package collectionMethod;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref = new ArrayList<>();
		ref.add(1);
		ref.add(34);
		ref.add(34);
		ref.add(56);
		
		Integer var = ref.get(3);
		int data = (int)var;
	}
}