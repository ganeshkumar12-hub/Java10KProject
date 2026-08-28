package com.coder.superKeyword;
//using super with method
class person{
	void display() {
		System.out.println("parent class");
	}
}
class student extends person{
	void display() {
		super.display();
		System.out.println("student class");
	}
}
public class superwithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student();
		s.display();

	}

}
