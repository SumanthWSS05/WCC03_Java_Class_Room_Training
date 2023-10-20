package abstraction;

public abstract class Parent {
	
	final int a = 9;
	
//	public abstract void start();
	
	public final void handle() {
		System.out.println("from handle method");
	}
	
	public void ring() {
		
	}
	
	public Parent() {
		System.out.println("from parent");
	}
}
