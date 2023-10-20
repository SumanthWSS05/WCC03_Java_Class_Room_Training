package abstraction;

public abstract class A1 {  //it is incomplete

	public static void paint() {
		System.out.println("from paint method");
	}
	
	public abstract void sketch();  //it is incomplete
	
	abstract void scribble();	
	
	public void dance() {
		System.out.println("Hello");
	}
}

class Q1 extends A1 {

	@Override
	public void sketch() {
		
		
	}

	@Override
	void scribble() {
		// TODO Auto-generated method stub
		
	}
	
}
class Q2{
	public static void main(String[] args) {
		A1 ref = new Q1();
		ref.dance();
		ref.scribble();
		A1.paint();
	}
}
