package com.sda.she_likes_java.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        Jogging slowMan = new SlowRunner();
        Jogging fastRunner = new FastRunner();
        justRun(slowMan);
        justRun(fastRunner);

        // anonymous classes - till java 7
        Jogging middleOne = new Jogging() {
            @Override
            public void run() {
                System.out.println("Running in the middle:)");
            }
        };
        middleOne.run();

        Jogging firstLambda = () -> {};
        Jogging secondLambda = () -> {
            System.out.println("Run from lambda");
        };
        secondLambda.run();

        justRun(() -> {
            System.out.println("in place:)");
        });

        Walker johnny = () -> {};

        Adder longVersion = (int first, int second) -> {
            return first + second;
        };

        // just names of parameters, without types
        Adder shorterVersion = (first, second) -> {
            return first + second;
        };

        Adder compactVersion = (first, second) -> first + second;
        int sum = compactVersion.addTwoNumbers(1, 5);
        System.out.println("sum of two 1 and 5 is: " + sum);

        Adder compactVersionWithManyInstructions = (first, second) -> {
            System.out.println("Performing operations...");
            return first + second;
        };
        compactVersionWithManyInstructions.addTwoNumbers(4, 4);
    }

    public static void justRun(Jogging runner) {
        runner.run();
    }
}
