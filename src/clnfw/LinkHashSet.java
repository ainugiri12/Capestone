package clnfw;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		/*
		 * Unique
		 * null
		 * insertion order
		 * 
		 */
		
		lhs.add(1);
		lhs.add(254);
		lhs.add(54);
		lhs.add(4);
		lhs.add(24);
		lhs.add(254);
		
		Iterator<Integer> i = lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
