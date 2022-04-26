package multh;

public class Test01Runnable extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("Hello from thread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}               
		
	}
	
	public void brake() {
		System.out.println("Brake is applied");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Test01Runnable t1 = new Test01Runnable();
		System.out.println("1");			//line by line
		t1.brake();							//
		System.out.println("3");			//
		t1.start();							// exl2
		System.out.println("5");			//		System.out.println("exl2");			//
		System.out.println("6");			//
		t1.sleep(1000);
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");			

		
	}

}
