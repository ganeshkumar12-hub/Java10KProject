package com.coder.oops;

public class encapsulation {
	int age;
	String name;
	int serial;
	
	void display() {
		System.out.println("the data : "+ " "+ serial + " "+ name+ " "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		encapsulation e1 = new encapsulation();
		e1.name = "ganesh";
		e1.age = 21;
		e1.serial = 101;
		
		e1.display(); 
	}

}
	