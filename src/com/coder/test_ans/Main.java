package com.coder.test_ans;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String s = "Hello";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println("no of vowels: "+count);
	}
}
