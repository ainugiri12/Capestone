package clnfw;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(120);
		h1.add(120);
		h1.add(150);
		h1.add(125);
		h1.add(120);
		h1.add(150);
		h1.add(125);
		h1.add(120);
		h1.add(151);
		h1.add(12);
		h1.add(10);
		h1.add(50);
		h1.add(25);
		h1.add(20);
		h1.add(50);
		h1.add(25);
		
		HashSet<Integer> h2 = new HashSet<>();

		h2.add(25);
		h2.add(20);
		h2.add(50);
		h2.add(25);
		
		Iterator<Integer> it1 = h1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("********************");
		
		h1.removeAll(h2);

		Iterator<Integer> it2 = h1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}
