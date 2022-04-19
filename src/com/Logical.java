package com;

import java.util.Scanner;	// ctrl+shift+F10

public class Logical {
	public static void main(String[] args) {
		int i,j;
		Scanner s1 = new Scanner(System.in);
		i = s1.nextInt();
		j = s1.nextInt();
		if(i>20 || j<20) {
			System.out.println("Cond is true");
		}
		s1.close();
	}

}
