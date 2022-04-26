package exhan;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * try with multiple catches
		 * try with catch and finally
		 * nested try
		 * 
		 */
		int a,b,c,d;
		try {
			a= Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=Integer.parseInt(args[2]);
			
			try {
				d=a/(b-c);
				System.out.println(d);
			}
			catch (ArithmeticException e) {
				d=1;
				System.out.println(e);
				System.out.println(d);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			a=10;
			b=5;	//11
			c=3;	//9		
			d=10;
			System.out.println("AIOE"+d);
		}
	}
}
