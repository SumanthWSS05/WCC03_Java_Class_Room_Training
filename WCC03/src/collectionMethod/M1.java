package collectionMethod;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M1 {

	public static void main(String[] args) {
		
		HashMap ref = new HashMap();
		ref.put(12, "Hema");
		ref.put('d', "Mohini");
		ref.put("Radhika",12);
		ref.put(12, "Priyanka");
		ref.put(13, "Archana");
		ref.put(22, "Shubhra");
		ref.put('a', "Kalpana");		
		
		System.out.println(ref.size());
		System.out.println(ref);
		
		System.out.println(ref.get(13));
		System.out.println(ref.get('a'));
		
		System.out.println("============================");
		Set keys = ref.keySet();
		for(Object k : keys) {
			System.out.println(ref.get(k));
		}
		
		ref.remove('d');
		System.out.println("============================");
		System.out.println(ref.size());
		System.out.println(ref);
		System.out.println(ref.containsKey(22));
		System.out.println(ref.containsValue(12));
	}

}
