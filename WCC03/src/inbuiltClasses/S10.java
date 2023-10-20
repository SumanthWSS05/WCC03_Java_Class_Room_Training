package inbuiltClasses;

public class S10 {

	//debug -> breakpoint
	public static void main(String[] args) {
		
		String name = "Selenium";
		
		String reverse = "";
		Library.print();
		for(int i=0 ; i<name.length() ; i++) {
			reverse = name.charAt(i) + reverse;
		}
		
		System.out.println(reverse);
	}
}
