package outsidePackage;

import exploringAccess.Members;

public class Access3 extends Members {

	public static void main(String[] args) {
		System.out.println("From diff class of same pack");
		Access3 mem = new Access3();
		System.out.println(mem.a);
		System.out.println(Members.b);
		mem.print();
		Members.run();
	}
}
