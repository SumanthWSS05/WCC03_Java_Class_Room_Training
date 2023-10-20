package polymorhism;

public class Drive {

	public static void main(String[] args) {
		A ref = new A();
		ref.demo();
		System.out.println("===============");
		ref = new B();
		ref.demo();
		System.out.println("===============");
		ref = new C();
		ref.demo();
		System.out.println("===============");
		ref = new D();
		ref.demo();
		System.out.println("===============");
		ref = new E();
		ref.demo();
		System.out.println("===============");
		ref = new F();
		ref.demo();
		System.out.println("===============");
	}

}
