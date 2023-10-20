package exploringAccess;

public class Members {

	protected char a = 'H';
	protected static char b = 'F';
	
	protected void print() {
		System.out.println("from print method");
	}
	
	protected static void run() {
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
