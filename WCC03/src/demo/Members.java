package demo;

public class Members {

	public char a = 'A';
	
	public static char b = 'Z';
	
	public void print() {
		System.out.println("from print method");
	}
	
	public static void run() {
		System.out.println("from run method");
	}
	
	public static void main(String[] args) {
		 Members mem = new Members();
		 System.out.println(mem.a);
		 System.out.println(Members.b);
		 mem.print();
		 Members.run();
	}
	
}
