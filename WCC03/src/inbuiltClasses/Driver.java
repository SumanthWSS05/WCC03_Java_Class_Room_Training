package inbuiltClasses;

public class Driver {

	public static void main(String[] args) {
		Student s = new Student(1, "Jyothi", "Ramesh", "Aishwarya", "DelhiPublic School");
		System.out.println(s);    //s.toString(); 
		Student s1 = s ;
		Student s2 = s1;
		System.out.println(s1);
		System.out.println("============================");
		s2.fatherName = "Varun Suresh";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);		
	}

}
