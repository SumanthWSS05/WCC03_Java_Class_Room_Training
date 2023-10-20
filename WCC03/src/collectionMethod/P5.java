package collectionMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fav fruit");
		String fruit = sc.next();

		ArrayList ref = new ArrayList();

		ref.add("Apple");
		ref.add("orange");
		ref.add("watermelon");
		ref.add("banana");
		ref.add("kiwi");

		fruit = fruit.toLowerCase().trim();
		boolean flag = false;
		for (Object name : ref) {
			if (fruit.equalsIgnoreCase((String) name)) {
				System.out.println("You are lucky");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("You are unlucky");
		}

	}

}
