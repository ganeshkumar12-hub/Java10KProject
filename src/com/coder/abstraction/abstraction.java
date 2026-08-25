package com.coder.abstraction;

//Abstraction means hiding the implementation details and showing only the essential functionality to the user.
abstract class Payment {

    abstract void pay();

    void paymentDetails() {
        System.out.println("Payment is being processed");
    }
}

class UPI extends Payment {

    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class CreditCard extends Payment {

    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay();
        p1.paymentDetails();

        Payment p2 = new CreditCard();
        p2.pay();
        p2.paymentDetails();
    }
}