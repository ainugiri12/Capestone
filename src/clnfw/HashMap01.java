package clnfw;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
	public static void main(String[] args) {
		/*
		 * no Duplicate
		 * not maintains insertion 
		 * sorting is not possible
		 * 
		 */
		HashMap<Integer, String> col = new HashMap<Integer,String>();
		col.put(1, "Processor");
		col.put(2, "RAM");
		col.put(3, "HDD");
		col.put(4, "Price");
		col.put(2,"HDD");
		
		for(Map.Entry m: col.entrySet()) {
			System.err.println(m.getKey()+"\t:\t"+m.getValue());
		}
		
	}
}
