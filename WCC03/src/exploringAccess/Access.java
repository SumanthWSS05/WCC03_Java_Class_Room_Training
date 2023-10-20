package exploringAccess;

import abstraction.I1;

public class Access {

	public static void main(String[] args) {
		
		System.out.println(I1.a);
		new Access().read();
	}
	
	public void read() {
		System.out.println("Hi welcome to Selenium");
	}
}

/*
 * in same class 
 * in diff class of same package
 * in diff class of diff package
 */
