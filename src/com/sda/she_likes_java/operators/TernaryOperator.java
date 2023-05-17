package com.sda.she_likes_java.operators;

// Three way operator
public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println(getMyName(true));
        System.out.println(getMyName(false));
    }

    public static String getMyName(boolean fullName) {
        // if condition is true return first part otherwise return second
        String result = fullName ? "Mariusz Pastuszka" : "Mariusz";
//        return result;

        String result2 = null;
        if (fullName) {
            result2 = "long value";
        } else {
            result2 = "short";
        }
        // the same with ternary operator
        result2 = fullName ? "long value" : "short";

        return result;
//        if (fullName) {
//            return "Mariusz Pastuszka";
//        } else {
//            return "Mariusz";
//        }
    }
}
