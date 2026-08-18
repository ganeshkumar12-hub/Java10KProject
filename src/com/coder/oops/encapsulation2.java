package com.coder.oops;

public class encapsulation2 {
	int age;
	String name;
	int serial;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSerial() {
		return serial;
	}


	public void setSerial(int serial) {
		this.serial = serial;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation2 e2 = new encapsulation2();
		e2.setAge(23);
		e2.setName("ganesh");
		e2.setSerial(101);
		
		System.out.println(e2.getAge());
		System.out.println(e2.getName());
		System.out.println(e2.getSerial());
	}

}
