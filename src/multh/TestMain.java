package multh;

public class TestMain {
 public static void main(String[] args) {
	 	Student s1 = new Student();
	 	MultiThread01 m1 = new MultiThread01(s1);
	 	MutliThread02 m2 = new MutliThread02(s1);
	 	m1.start();
		m2.start();
}
}
