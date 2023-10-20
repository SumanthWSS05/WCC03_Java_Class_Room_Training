package inbuiltClasses;

public class S9 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = s1;
		
		s1 = s1 + " Bye";
		
		s1 = s1 + " Welcome";   //Hello Bye Welcome
		
		System.out.println(s2);	//Hello
		System.out.println(s1);
		
	}
}
