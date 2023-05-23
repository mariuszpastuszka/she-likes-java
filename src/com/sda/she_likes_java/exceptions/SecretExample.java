package com.sda.she_likes_java.exceptions;

public class SecretExample {

    public static void main(String[] args) {
        SecretLocker secretStorage = new SecretLocker(
                null
        );

        System.out.println("I know Your secret now!!!");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy biggest secret was: " + enemySecret);

        try {
            System.out.println("Inside try block");
            Secret enemysSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemy's secret: " + enemysSecret);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After problematic source code");

        Exception exception = new DecryptionIssueException("no reason");
        System.out.println();
        System.out.println("Let's play again with our own exceptions");
        try {
            Secret stupidSecret = secretStorage.decrypt();
        } catch (HSMConnectionException e) {
            System.out.println("Connection issue: " + e.getMessage());
        } catch (DecryptionIssueException e) {
            System.out.println("Cannot decrypt enemy's secret: " + e.getMessage());
        }

        System.out.println("Now with single catch");
        try {
            secretStorage.decrypt();
        } catch (DecryptionIssueException e) {
            System.out.println("Cannot decrypt enemy's secret: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic catch all :)");
        }
    }
}
