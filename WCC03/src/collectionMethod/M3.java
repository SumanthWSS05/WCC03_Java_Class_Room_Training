package collectionMethod;

import java.util.TreeMap;
import java.util.Map.Entry;

public class M3 {

	public static void main(String[] args) {

		
		TreeMap<Student, Integer> ref = new TreeMap<>();
		ref.put(new Student(12, "Hema", "Java-Selenium"),1);
		ref.put(new Student(8, "Kalpana", "Java-Selenium"),2);
		ref.put(new Student(4, "Mohini", "Java-Selenium"),3);
		ref.put(new Student(16, "Shubhra", "Java-Selenium"),4);
		ref.put(new Student(11, "Priyanka", "Java-Selenium"),5);
		ref.put(new Student(10, "Radhika", "Java-Selenium"),6);
		ref.put(new Student(20, "Archana", "Java-Selenium"),7);
		ref.put(new Student(23, "Hemalatha", "Java-Selenium"),8);
		
//		System.out.println(ref.get("priyanka"));
//		System.out.println(ref);
		
		for(Entry<Student, Integer> data : ref.entrySet()) {
			System.out.print(data.getKey() +" , ");
			System.out.println(data.getValue());
		}
	
	}
	
}
