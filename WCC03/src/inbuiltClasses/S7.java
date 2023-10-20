package inbuiltClasses;

public class S7 {

	public static void main(String[] args) {
		
		String s1 = "aila";		
		String s2 = "laila";
		String s3 = "l" + s1;
		
		System.out.println(s3 == s2);		
		System.out.println(s3.equals(s2));
		
		String a1 = "Java";		
		String a2 = new String("Java");
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		
		
	}
}
