package exploringAccess;

public class Access2 extends Members {

	public static void main(String[] args) {
		 Members ref = new Members();
		 System.out.println(ref.a);
		 System.out.println(Members.b);
		 ref.print();
		 Members.run();
	}
}
