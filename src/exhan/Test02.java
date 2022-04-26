package exhan;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * try{
		 * }
		 * catch(_____ ){}
		 * finally{
		 * }
		 * 
		 * try{}
		 * finally{}
		 * 
		 * try{}
		 * catch{}
		 * finally{}
		 * 
		 * 
		 */

		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		try {
			d=a/(b-c);		//  	-	6-6=0	------	
		}
		catch(Exception e) {
			d=1;
			
		}
		finally {
			sc.close();
			System.out.println("Scanner closed");
		}
		System.out.println("d value is" + d);
	}

}
	