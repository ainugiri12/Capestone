package clnfw;

interface Testing{
	void test(String s);
}
public class Test02 implements Testing{
	public void test(String s) {
		System.out.println("Testing done "+s);
	}
	
	public static void main(String[] args) {
		Test02 t1 = new Test02();
		t1.test("Program");
	}
}
