package com.coder.superKeyword;

class Person {

    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {

    Student() {
        super();
        System.out.println("Student constructor");
    }
}

public class superwithConstructor {

    public static void main(String[] args) {

        Student s = new Student();
    }
}