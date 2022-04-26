package multh;

public class MultiThread01 extends Thread{
	Student s1;
	
	public MultiThread01(Student s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.printNo();
		s1.disp();
	}
}