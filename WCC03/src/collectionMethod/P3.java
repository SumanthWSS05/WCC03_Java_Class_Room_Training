package collectionMethod;

import java.util.ArrayList;

public class P3 {

	public static void main(String[] args) {
		
		ArrayList mobiles = new ArrayList();
		mobiles.add("Iphone");
		mobiles.add("OnePlus");
		System.out.println(mobiles);
		
		System.out.println("====================================");
		ArrayList smartPhones = new ArrayList();
		smartPhones.add("Vivo");
		smartPhones.add("Oppo");
		smartPhones.add("Samsung");
		System.out.println(smartPhones);
		
		mobiles.addAll(1, smartPhones);
		System.out.println("======after merging========");
		System.out.println(mobiles);
	}
}
