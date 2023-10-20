package collectionMethod;

import java.util.ArrayList;

public class P4 {

	public static void main(String[] args) {
		
		ArrayList mobiles = new ArrayList();
		mobiles.add("Iphone");
		mobiles.add("OnePlus");
		System.out.println(mobiles);
		
		System.out.println("====================================");
		ArrayList smartPhones = new ArrayList();
		smartPhones.add("Iphone");
		smartPhones.add("OnePlus");
		smartPhones.add("Vivo");
		smartPhones.add("Oppo");
		smartPhones.add("Samsung");
		System.out.println(smartPhones);
		
		smartPhones.removeAll(mobiles);
		System.out.println("========after altering==========");
		System.out.println(smartPhones);
		
		
	}
}
