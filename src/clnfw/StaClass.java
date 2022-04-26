package clnfw;

import java.util.Iterator;
import java.util.Stack;

public class StaClass {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("BMW");
		s1.push("Tata");
		s1.push("Fiat");
		s1.push("Ferrari");
		
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("***********************");
		
		s1.pop();
		Iterator<String> i2 = s1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		
	}

}
