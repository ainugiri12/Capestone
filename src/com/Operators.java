package com;

public class Operators {
	public static void main(String[] args) {
		// symbols  
		// unary oper
		
		int i=100,j;
		i=i+1;	// 101
		i++;	// 102
		System.out.println("i "+i);
		j=i--;		// j= i = i+1;
		System.out.println("i "+i);
		System.out.println("j "+j);
		i++;	// postfix
		System.out.println("i "+i);
		++i;	// prefix
		System.out.println("i "+i);
		j=++i;	// 	
		System.out.println("i "+i);
		System.out.println("j "+j);
		
	}

}
