package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {

        // instanceof operator - tests if argument is of given type
        // tests if maybeWomanOrMan is of type Man
        // instanceof gives us boolean result
        if (maybeWomanOrMan instanceof Man) {
            System.out.println("It's a monster:)");
            // casting / down casting
            // works for the references
            (
                    (Man) maybeWomanOrMan
            ).learnToCleanHouse();

            ((Man) maybeWomanOrMan).learnToCleanHouse();
        }

        if (maybeWomanOrMan instanceof Woman) {
            System.out.println("It's woman");
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }
}
