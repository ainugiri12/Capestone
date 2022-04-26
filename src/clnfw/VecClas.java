package clnfw;

import java.util.Iterator;
import java.util.Vector;

public class VecClas {
/*
 * Vector dynamic array
 * 
 */
	public static void main(String[] args) {
		Vector<String> nl = new Vector<String>();
		nl.add("RAM");
		nl.add("Motherboard");
		
		Iterator<String> i1 = nl.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}
	
}
