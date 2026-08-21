package com.coder.inheritance;
class Employee {

    String name = "Ganesh";

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println(name + " is writing Java code");
    }
}

public class inheritance2 {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
        d.code();
    }
}