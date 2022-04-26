package clnfw;
import java.util.Iterator;
import java.util.TreeSet;
/*
 * Insertion order
 * No duplicate
 * Sort 
 */
public class TreeSet123 {
	public static void main(String[] args) {
		TreeSet<String> l = new TreeSet<String>();
		l.add("Suresh");
		l.add("Triveni");
		l.add("Azhar");
		l.add("Giri");
		l.add("Triveni");
		
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("Initial Set:"+l);
		
		System.err.println("Reverse List:"+l.descendingSet());
		
		System.out.println(l.pollFirst());
		
		
	}
}
