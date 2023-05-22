package com.sda.she_likes_java.exceptions;

public class MyBrokenException {

    private String message;

    public MyBrokenException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBrokenException{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }
}
