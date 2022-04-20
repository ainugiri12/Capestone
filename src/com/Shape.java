package com;

import java.security.PKCS12Attribute;

public class Shape {
	
	public int area(int a) {		
		System.out.println("Area of Square");
		return a*a;
	}
	
	public int area(int l, int b) {
		System.out.println("Area of Rectangle");
		return l*b;
	}
	
	public float area(float b,float h) {
		System.out.println("Area of Triangle");
		return b*h/2;
	}
	
	public float area(float rad){
		System.out.println("Area of circle");
		return 22*rad*rad/7;
	}		// method overloading\
	
	public void display1() {
		System.out.println("Public");
	}
	
	protected void display2() {
		System.out.println("Protected");
	}
	private void display3() {
		System.out.println("private");
	}
	void display4() {
		System.out.println("deafault");
	}
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.display1();
		s1.display2();
		s1.display3();
		s1.display4();
	}
}