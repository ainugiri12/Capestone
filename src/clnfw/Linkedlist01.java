package clnfw;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist01 {
	public static void main(String[] args) {
		LinkedList<String> cand = new LinkedList<String>();
		cand.add("Giri");
		cand.add("Prasad");
		cand.add("Suresh");
		cand.add("Chandan");
		cand.add(2, "Mohamed");
		System.out.println("************************");
		
		Iterator<String> x = cand.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}

		System.out.println("************************");
		cand.remove();
		Iterator<String> y = cand.iterator();

		while(y.hasNext()) {
			System.out.println(y.next());
		}
		System.out.println("************************");
		
		cand.add(1,"Rahman");
		Iterator<String> z = cand.iterator();

		while(z.hasNext()) {
			System.out.println(z.next());
		}
		System.out.println("************************");
		
	}
}
