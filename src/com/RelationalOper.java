package com;

import java.util.Scanner;	// ctrl+shift+F10

public class RelationalOper {
	public static void main(String[] args) {
		int i,j;
		Scanner s1 = new Scanner(System.in);
		i = s1.nextInt();
		j = s1.nextInt();
		if(i != j) {
			System.out.println("Not Equal");
		}
		else {
			System.out.println("Equal");
		}
		s1.close();
	}

}
