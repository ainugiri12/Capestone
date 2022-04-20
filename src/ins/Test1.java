package ins;

public class Test1 {
	int a,b,c,d;
	private float avg;	
	public Test1(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public float calAvg() {
		avg = (a+b+c+d)/4;
		return avg;
	}
}
