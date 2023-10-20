package exploringAccess;

import abstraction.Child;
import abstraction.Parent;

public class Access1 {

	public static void main(String[] args) {

		System.out.println("From diff class of same pack");
		Members mem = new Members();
		System.out.println(mem.a);
		System.out.println(Members.b);
		mem.print();
		Members.run();
		Parent ref = new Child();
//		ref.start();
	}
}

//for alligning 
// ctrl + i
// ctrl + shift + f

//for comment
//ctrl + 7  -> line comment (multiple line comments)
//ctrl + shift + / -> paragraph comment
//ctrl + shift + \ -> remove paragraph comment
