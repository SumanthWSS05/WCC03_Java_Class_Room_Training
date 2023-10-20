package inbuiltClasses;

public class S12 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = s1;		
		s1 = s2 + " Selenium";
		System.out.println(s1);  //Java
		System.out.println(s2);  //Java Selenium
		
		//=====================================
		StringBuffer ref1 = new StringBuffer("Java");
		StringBuffer ref2 = ref1;
		
		ref1 = ref1.replace(0, ref1.length(), " Selenium");
		System.out.println(ref1);  //Java Selenium
		System.out.println(ref2);  //Java Selenium
	}
}
