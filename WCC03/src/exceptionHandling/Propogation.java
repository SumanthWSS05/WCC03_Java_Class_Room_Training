package exceptionHandling;

public class Propogation {

	public static void main(String[] args) {
		System.out.println("main begins");
		AA.AMethod();
		System.out.println("main ends");
	}
}

class AA {

	public static void AMethod() {
		System.out.println("Amethod begins");
		try{
			BB.bMethod();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Amethod ends");
	}
}

class BB {

	public static void bMethod() {
		System.out.println("Bmethod begins");
		CC.cMethod();
		System.out.println("Bmethod ends");
	}
}

class CC {

	public static void cMethod() {
		System.out.println("Cmethod begins");
		DD.dMethod();
		System.out.println("Cmethod ends");
	}
}

class DD {

	public static void dMethod() {
		System.out.println("Dmethod begins");
		int i = 1/0;
		System.out.println("Dmethod ends");
	}
}