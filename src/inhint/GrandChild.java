package inhint;

public class GrandChild extends ChildClass1 implements ChildInt2 {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Printing from Grand Child");
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Printing from Grand Child");
	}
	public static void main(String[] args) {
		GrandChild g1 = new GrandChild();
		g1.m1();
		g1.m2();
		g1.m3();
		g1.m4();
	}
}

// multiple inter

