package collectionMethod;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class P7 {

	public static void main(String[] args) {

		LinkedList playlist = new LinkedList();
		playlist.add("Munbae vaa");
		playlist.add("Taal se taal");
		playlist.add("jara sa jhoom le tu");
		playlist.add("ee bhumi bannada buguri");
		playlist.add("Inaye en");
		playlist.add("dil se");
		
		System.out.println("Checking : "+ playlist.contains("Munbae vaa"));

		ListIterator it = playlist.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("==================================");

		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

//		Iterator i = playlist.iterator();
//
//		while (i.hasNext()) {
//			System.out.println(i.next());
//
//		}
	}

}
