package com.sda.she_likes_java.exceptions;

public class BankExample {

    public static void main(String[] args) {
        BankConnector connector = new BankConnector();
        int balance = connector.accountBalanceAlwaysSuccessful();
        if (balance > 0) {
            System.out.println("I've got money");
        } else {
            System.out.println("Debit");
        }
        System.out.println("Let's try to check balance of my account");
        int myMoney = 0;
        try {
            myMoney = connector.accountBalance();
            System.out.println("My money: " + myMoney);
        } catch (Exception e) {
            System.out.println("Unexpected condition occurred");
            System.out.println("Exception: " + e);
        }
        System.out.println("Here");
    }
}
