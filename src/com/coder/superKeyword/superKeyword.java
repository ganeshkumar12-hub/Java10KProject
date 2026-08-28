package com.coder.superKeyword;
//using super with variable
class vehicle{
	int maxSpeed = 120;
}
class car extends vehicle{
	int maxSpeed = 180;
	void display() {
		System.out.println("max speed : "+super.maxSpeed);
	}
}
public class superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.display();
	}

}
