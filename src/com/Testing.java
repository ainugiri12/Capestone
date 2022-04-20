package com;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford f1 = new Ford();
		f1.carNo=101;
		f1.fuelType="Petrol";
		f1.maxSpeed=200;
		f1.vehType="auto";
		f1.registerCar();		// ford
		f1.start();				// Vehicle
		f1.accel();				// car				// child  redefining
	}
}