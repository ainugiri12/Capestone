package clnfw;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayColl {
	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(101);		//0
		items.add(102);		//1
		items.add(205);		//2
		items.add(150);		//4		
		items.add(78);		//5
		items.add(780);		//6
//		items.add(305);
		items.add(3,305);
		Iterator i = items.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(items.size());	
	}

}
