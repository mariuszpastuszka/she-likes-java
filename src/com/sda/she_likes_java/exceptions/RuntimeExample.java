package com.sda.she_likes_java.exceptions;

import java.util.HashMap;
import java.util.Map;

public class RuntimeExample {

    public static void main(String[] args) {
        try {
//            throwRuntimeException();
            String name = null;
            if (name != null) {
                name.length();
            }
        } catch (NullPointerException e) {
            System.out.println("here");
        }

        try {
            int[] numbers = new int[4];
            numbers[99] = 1;

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    public static void throwRuntimeException() throws MyRuntimeException {
        throw new MyRuntimeException("Do I need to handle it??");
    }

    public static void unexpectedNull() {
        Map<String, String> map = new HashMap<>();
        String value = map.get("some-key");
        System.out.println(value != null ? value.length() : 0);
    }
}
