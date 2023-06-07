package com.sda.she_likes_java.final_project.exception;

public class InexperiencedUserException extends Exception {

    public InexperiencedUserException() {
    }

    public InexperiencedUserException(String message) {
        super(message);
    }

    public InexperiencedUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public InexperiencedUserException(Throwable cause) {
        super(cause);
    }

    public InexperiencedUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
