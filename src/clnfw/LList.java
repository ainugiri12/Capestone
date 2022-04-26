package clnfw;

import java.util.Iterator;
import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(785);
		ll1.addLast(854);
		ll1.add(1, 254);
		ll1.add(856);
		ll1.add(785);
		
		// insertion 
		System.out.println(ll1.get(0));
		System.out.println("*************************");
		Iterator<Integer> it1 = ll1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
