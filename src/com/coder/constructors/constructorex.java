package com.coder.constructors;

class ConstructorEx {

    String name;
    int age;

    // Constructor
    ConstructorEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorEx obj = new ConstructorEx("Ganesh", 22);

        obj.display();
    }
}
