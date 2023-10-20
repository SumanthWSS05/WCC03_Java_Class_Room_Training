package polymorhism;

public class Driver {

	public static void main(String[] args) {	
		Smith ref =  new Kiran();  
		Kiran ref1 = (Kiran) ref; 
		ref1.dance();
	}
}
