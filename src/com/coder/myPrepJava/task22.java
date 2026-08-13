package com.coder.myPrepJava;
import java.util.*;
public class task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password : ");
		int pass = sc.nextInt();
		while(true) {
			if(pass==123) {
				System.out.println("password match");
				break;
			}
			else {
				System.out.println("password not match");
				break;
			}
		}
	}

}
