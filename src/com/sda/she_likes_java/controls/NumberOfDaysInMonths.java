package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class NumberOfDaysInMonths {
    public static void main(String[] args) {
        System.out.println("Hey, tell me the number of the month: ");
        Scanner inputReader = new Scanner(System.in);
        int monthNumber = inputReader.nextInt();

        // switch with fall through
        switch (monthNumber) {
            // if there's no matching case value default one would be used
            // default is optional - sometimes it doesn't exist
            default:
                System.out.println("Don't cheat:)");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
        }
    }
}
