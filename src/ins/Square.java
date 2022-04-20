package ins;

public class Square extends Shape {
    int side =24;
	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
	
	public static void main(String[] args) {
		Square s1 = new Square();
		s1.draw();
		System.out.println("Area of Square "+s1.calArea());
	}
}
