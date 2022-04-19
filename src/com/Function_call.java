package com;

import java.util.Scanner;

public class Function_call {
	// function
	// access_modifier return_type methodname(input set of)
	public int zalf(int a, int b){
		return (a+b)/(a-b);
	}
	public static void main(String[] args) {
		int i,j;
		Scanner s1= new Scanner(System.in);
		i=s1.nextInt();
		j=s1.nextInt();
		Function_call f1 = new Function_call();
		int out = f1.zalf(i, j);
		System.out.println(out);
		i=s1.nextInt();
		j=s1.nextInt();
		out = f1.zalf(i, j);
		System.out.println(out);
		s1.close();
	}
}
