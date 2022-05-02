package clnfw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArraylIst1 {
	public static void main(String[] args) {
		/*
		 * ArrayList
		 * Stores duplicate	---------
		 * Insertion ordered	-----
		 * Sort ---------------------
		 * 
		 */
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(25);		//0
		al1.add(25);		//1
		al1.add(35);		//2
		

		ArrayList<String> l1 = new ArrayList<String>();
//		TreeSet<String> l1 = new TreeSet<>();
//		HashSet<String> l1 = new  HashSet<>();
//		HashMap<, V>
		
//		SortedSet<String> l1 = new TreeSet<String>();
		l1.add("Preethi Agnes");
		l1.add("Agnes Preethi");
		l1.add("Agnes Preethi");
		l1.add("Chitrala Suresh");
		l1.add("Amarnath");
		l1.add("Agnes Preethi");
		l1.add("Yaswanth");
		
		Iterator<String> i = l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}
}
