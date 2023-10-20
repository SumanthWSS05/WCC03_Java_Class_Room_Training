package polymorhism;

public class DM {

	public static void main(String[] args) {
		
		Parent ref = new Child();
		ref.swim();	
		ref.karate();
	}

}
