package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreak {

    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;

        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me:)");
        do {
            System.out.println("Guess a number between 1 and 20");
            userAnswer = inputReader.nextInt();
            numberOfTrials--;
            if (numberOfTrials <= 0) {
                System.out.println("No more trials...");
                break;
            }
        } while (userAnswer != someRandomNumber);

        if (userAnswer == someRandomNumber) {
            System.out.println("Great, You win!!!");
        } else {
            System.out.println("You've lost:(");
        }
    }
}
