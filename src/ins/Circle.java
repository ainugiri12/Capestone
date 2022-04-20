package ins;

public class Circle extends Shape {
	float rad = 8;
	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return rad*rad*22/7;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		System.out.println("Area of circle "+c1.calArea());
	}

}
