package com.coder.myPrepJava;
import  java.util.*;

import java.util.Scanner;

public class task21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println("       STUDENT ATTENDANCE");
        System.out.println("---------------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Student " + i + " name: ");
            String name = sc.nextLine();
            System.out.println("Student " + i + " : " + name);
        }
    }
}