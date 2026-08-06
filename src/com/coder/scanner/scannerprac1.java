package com.coder.scanner;
import java.util.*;
public class scannerprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account details : ");
		long acc_no = sc.nextLong();
		sc.nextLine();
		System.out.println("enter the holder name : ");
		String name = sc.nextLine();
		System.out.println("enter the age : ");
		int age = sc.nextInt();
		System.out.println("enter the amount withdrawn : ");
		int withdraw = sc.nextInt();
		System.out.println("enter the total amount : ");
		int tot_amt = sc.nextInt();
		System.out.println("Balance amount : " + (tot_amt-withdraw));
	}

}
