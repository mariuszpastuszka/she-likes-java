package com.sda.she_likes_java.homework.exercise_29;

public class PostalCodeException extends Exception {

    public PostalCodeException() {
    }

    public PostalCodeException(String message) {
        super(message);
    }

    public PostalCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PostalCodeException(Throwable cause) {
        super(cause);
    }

    public PostalCodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
