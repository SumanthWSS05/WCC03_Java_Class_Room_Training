package polymorhism;

public class ClassA {

	ClassA() {
		System.out.println("const 1");
	}
	
	ClassA(int a) { 
		System.out.println("const 2");
	}
	
	ClassA(double b) { 
		System.out.println("const 3");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		ClassA ref = new ClassA(23);
		System.out.println(ref.add(10,20));
		System.out.println("main ends");
	}
}
