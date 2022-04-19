package com;

public class BasicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = true;	// result
		char grade = 'A';
		byte inp1= (byte) 254;
		inp1 = (byte) (inp1 + 6);
		System.out.println(inp1);
		
		int inp2 = 254;
		// instruction
		// linear 
		// selection
		// jump
		// conditional
		// iterations
		// selection
		// execure
		
		
		System.out.println("executed");
		if(inp2%2==1) {
			System.out.println("Odd");
			
		}
		else {
			System.out.println("Even");
		}
		
		
		for(int i=0;i<=5;i++) {
			System.out.println("i value "+i);
		}
		int i=0;
		while(i<=5) {
			System.out.println("i value "+i);
			i++;
		};
		
		System.out.println("outside the lood the value of i is "+i);
		
		while(i<=5) {
			System.out.println("i from 2nd while loop value "+i);
			i++;
		};
		
		do {
			System.out.println("Print the value from do while "+i);
			i++;
		}while(i<=5);	
		System.out.println("outside the lood the value of i is "+i);
		
	}

}
