package abstraction;

public class DriverC extends Parent {

	public static void main(String[] args) {
		DriverC ref = new DriverC();
//		System.out.println(I4.a);
	}
	
	public DriverC() {
		super();
		System.out.println("from no arg const");
	}
	
	public DriverC(int a) {
		System.out.println("parm const");
	}
}
