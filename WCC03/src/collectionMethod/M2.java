package collectionMethod;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class M2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Student> ref = new LinkedHashMap<>();
		ref.put("Hema", new Student(12, "Hema", "Java-Selenium"));
		ref.put("Kalpana", new Student(8, "Kalpana", "Java-Selenium"));
		ref.put("Mohini", new Student(4, "Mohini", "Java-Selenium"));
		ref.put("Shubhra", new Student(16, "Shubhra", "Java-Selenium"));
		ref.put("Priyanka", new Student(11, "Priyanka", "Java-Selenium"));
		ref.put("Radhika", new Student(10, "Radhika", "Java-Selenium"));
		ref.put("Archana", new Student(20, "Archana", "Java-Selenium"));
		ref.put("Hema", new Student(23, "Hemalatha", "Java-Selenium"));
		
		System.out.println(ref.get("priyanka"));
		System.out.println(ref);
		
		for(Entry<String, Student> data : ref.entrySet()) {
			System.out.print(data.getKey() +" , ");
			System.out.println(data.getValue());
		}
	}

}
