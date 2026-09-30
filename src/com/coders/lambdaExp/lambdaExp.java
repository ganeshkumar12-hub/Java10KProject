package com.coders.lambdaExp;

interface Greeting {
    void sayHello();
}

public class lambdaExp {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello Ganesh");
        };

        g.sayHello();
    }
}