package abstraction;

public final class Basics {

	final int a = 34;
	
	public static void main(String[] args) {
		
		Basics ref = new Basics();
		System.out.println(ref.a);
//		ref.a = 23;
		System.out.println(ref.a);
	}
	
	public final void work() {
		System.out.println("he is a racer");
	}
}
