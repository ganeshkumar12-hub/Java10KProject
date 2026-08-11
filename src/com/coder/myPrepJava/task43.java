package com.coder.myPrepJava;


public class task43 {

    // Method to deposit money
    static double deposit(double balance, double amount) {
        balance = balance + amount;
        return balance;
    }

    // Method to withdraw money
    static double withdraw(double balance, double amount) {

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }

        return balance;
    }

    // Method to display balance
    static void displayBalance(double balance) {
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {

        double balance = 10000;

        displayBalance(balance);

        balance = deposit(balance, 5000);
        System.out.println("After Deposit:");
        displayBalance(balance);

        balance = withdraw(balance, 3000);
        System.out.println("After Withdrawal:");
        displayBalance(balance);
    }
}
