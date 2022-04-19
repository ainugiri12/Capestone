package com;

import java.util.Scanner;

public class Flow_Program {
	// data + logic
	// set of inst
	// ---linear pro		-----------------
	// flow by con, iterations
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int op;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your option");
		System.out.println("Press\n"
				+ "1. English \n"
				+ "2. Hindi \n"
				+ "3. Telugu \n"
				+ "4. Tamil \n");
		op = s1.nextInt();
		s1.close();
		/*
		 * if(op == 1) {
		 * 
		 * } else if(op == 2) {
		 * 
		 * } else if(op == 3) {
		 * 
		 * } else if(op == 4) {
		 * 
		 * } else {
		 * 
		 * }
		 */
		switch(op) {
		case 1:
			System.out.println("Give the instruction in English");
			break;
		case 2:
			System.out.println("Give the instruction in Hindi");
			break;
		case 3:
			System.out.println("Give the instruction in Telugu");
			break;
		case 4:
			System.out.println("Give the instruction in Tamil");
			break;
		default:
			System.out.println("Kindly press the right option");
		}
		
	}

}
