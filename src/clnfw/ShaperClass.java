package clnfw;

public class ShaperClass implements Area {

//	@Override
//	public void drawShape() {
//		// TODO Auto-generated method stub
//			System.out.println("Shape is drwan");
//	}
//	
	public static void main(String[] args) {
		Area a1 = (a,b)->(a*b/2);
		System.out.println(a1.calcArea(15, 20));
		System.out.println(a1.calcArea(25, 20));
		System.out.println(a1.calcArea(35, 20));
		System.out.println(a1.calcArea(45, 20));
	}

}
