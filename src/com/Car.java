package com;

public class Car {
	// state				variables		
	// behavior				functions
	String carNo, manfCompany;
	int model;
	
	// constructor ->
	
	public Car(String carNo, String manfCompany, int model) {
		super();
		this.carNo = carNo;
		this.manfCompany = manfCompany;
		this.model = model;
	}
	
	
	public void start(){
		System.out.println("Start the car with the number"+carNo);
	}
	
	public void stop(){
		System.out.println("stop the car with the number"+manfCompany);
		
	}
	
	public void brake(){
		System.out.println("decrese the car speed ");
		
	}
	public void increaseSpeed(int addspd){
		for(int i=0;i<addspd;i++) {
		System.out.println("Increase the speed\t:"+manfCompany);
		}
	}
	
}
