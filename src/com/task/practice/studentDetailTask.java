package com.task.practice;

import java.util.*;

public class studentDetailTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studId = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Student Name: ");
        String studName = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter HTML Marks: ");
        int html = sc.nextInt();

        System.out.print("Enter CSS Marks: ");
        int css = sc.nextInt();

        System.out.print("Enter JavaScript Marks: ");
        int js = sc.nextInt();

        System.out.print("Enter SQL Marks: ");
        int sql = sc.nextInt();

        System.out.println("\n========== Student Details ==========");
        System.out.println("Student ID   : " + studId);
        System.out.println("Student Name : " + studName);
        System.out.println("Course Name  : " + courseName);

        System.out.println("\n========== Marks Obtained ==========");
        System.out.println("Java : " + java);
        System.out.println("HTML : " + html);
        System.out.println("CSS  : " + css);
        System.out.println("JS   : " + js);
        System.out.println("SQL  : " + sql);

        int totalMarks = java + html + css + js + sql;
        double averageMarks = totalMarks / 5.0;

        System.out.println("\nTotal Marks   : " + totalMarks);
        System.out.println("Average Marks : " + averageMarks);

        sc.close();
    }
}