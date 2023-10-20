package inbuiltClasses;

public class S5 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);       	//false   
		System.out.println(s1.equals(s2));	//true
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s3==s4);			//true
		System.out.println(s3.equals(s4));	//true
	}
}
