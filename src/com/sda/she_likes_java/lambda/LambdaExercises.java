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
    }

    public static void justRun(Jogging runner) {
        runner.run();
    }
}
