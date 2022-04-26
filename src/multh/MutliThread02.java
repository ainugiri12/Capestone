package multh;

public class MutliThread02 extends Thread {
	Student s1;
	
	public MutliThread02(Student s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.printNo();
		s1.disp();
	}
}
