package exhan;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws ArithmeticException {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		d=a/(b-c);
		System.out.println("a,b,c,d\t:\t"+a+" "+b+" " +c+" "+d);
		System.out.println("EOD");
	}
}
