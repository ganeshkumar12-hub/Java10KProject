package com.coder.interfaceex;

//An interface in Java is a blueprint that defines a set of methods that a class must implement. It is mainly used to achieve abstraction and multiple inheritance in Java.
interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment using UPI");
    }
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

public class interfaceex {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new CreditCard();
        p2.pay();
    }
}