package com.sda.she_likes_java.exceptions;

public class DecryptionIssueException extends Exception {

    public DecryptionIssueException() {
    }

    public DecryptionIssueException(String message) {
        super(message);
    }

    public DecryptionIssueException(String message, Throwable cause) {
        super(message, cause);
    }

    public DecryptionIssueException(Throwable cause) {
        super(cause);
    }

    public DecryptionIssueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
