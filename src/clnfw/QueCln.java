package clnfw;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueCln {
	public static void main(String[] args) {
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Cat");
		q1.add("B");
		q1.add("Z");
		q1.add("App");
		q1.add("new position");
		System.out.println("head \t:\t"+q1.element());

		System.err.println("*****************");
		Iterator<String> i1 = q1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.err.println("*****************");
		q1.remove();
		Iterator<String> i2 = q1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.err.println("*****************");
		
	}

}
