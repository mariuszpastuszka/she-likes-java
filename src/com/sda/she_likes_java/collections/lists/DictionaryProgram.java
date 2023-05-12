package com.sda.she_likes_java.collections.lists;

import java.io.Console;
import java.util.Scanner;

public class DictionaryProgram {

    public static void main(String[] args) {
        System.out.println("Hi, which dictionary you'd like to use");
        System.out.println("type 1 for English - Cech");
        System.out.println("type 2 for English - Polish");
//        Console console = System.console();
//        String userChoice = console.readLine();
        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();

        MyGreatDictionary currentDictionary;
        if (userChoice.equals("1")) {
            currentDictionary = MyDictionaries.createEnglishCechDictionary();
            System.out.println("let's use English - Cech dictionary");
        } else if (userChoice.equals("2")) {
            currentDictionary = MyDictionaries.createEnglishPolishDictionary();
            System.out.println("let's use English - Polish dictionary");
        } else {
            System.out.println("I don't know what you mean");
            return;
        }

        System.out.println("Provide word to translate: ");
        String wordFromTheUser = inputReader.next();
        currentDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
    }
}
