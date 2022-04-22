package exhan;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	// able to check
	//  
	// unchecked 
//	int i1,i2;
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a value for X");
//	i1 = sc.nextInt();
//	System.out.println("Enter a value for Y");
//	i2 = sc.nextInt();
//	if(i1>i2) {
//		System.out.println("X is Greater");
//	}
//	else System.out.println("Y is Greater");
	int a,b;
	float c;
	System.out.println("Enter the value for A");
	a = sc.nextInt();
	System.out.println("Enter the value for B");
	try {
		b =  Integer.parseInt(args[2]);
		c= a*(22/7)/b;			//b as  handle 
	}
	
	catch(ArithmeticException ae) {
		System.out.println(ae);
		b=1;
		c= a*(22/7)/b;	
	}
	
	catch(Exception e) {
		System.out.println(e);		
		b=2;
		c= a*(22/7)/b;			//b as  handle
	}
	
	System.out.println("c value is "+c);
	System.out.println("Calculation Done");
	sc.close();
	System.out.println("End of the Program");
	
	
}
}
