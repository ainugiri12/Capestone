package com;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.FirstName="Giri Prasad ";
		s1.markAttendance();
		s1.payFee(15000);
		
		Student s2 = new Student();
		s2.FirstName="anitha ";
		s2.markAttendance();
		s2.payFee(15000);
		
		Student s3 = new Student();
		s3.FirstName="Easier";
		s3.markAttendance();
		s3.payFee(15000);
		
		Student s4 = new Student();
		s4.FirstName="Azhar";
		s4.markAttendance();
		s4.payFee(15000);
		
		Car c1 = new Car("AP01AZ0555", "BMW", 2021);
		Car c2 = new Car("BH01AZ0555", "Ford", 2021);
		Car c3 = new Car("WB01AZ0555", "Maruti", 2021);
		Car c4 = new Car("PB01AZ0555", "Tata", 2021);
		Car c5 = new Car("TN21AK0021", "Honda", 2022);
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c2.increaseSpeed(3);
		c3.increaseSpeed(5);
		c5.increaseSpeed(10);
		c5.stop();
	}

}
