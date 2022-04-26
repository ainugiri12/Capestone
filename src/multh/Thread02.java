package multh;

public class Thread02 {
	public static void main(String[] args) {
		Thread t1 = new Thread("MyThread");
		t1.start();
		String str = t1.getName();
		System.out.println(str);
	}

}
