package com.sda.she_likes_java.exceptions;

public final class HSMConnectionException extends Exception {
    public HSMConnectionException() {
    }

    public HSMConnectionException(String message) {
        super(message);
    }

    public HSMConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public HSMConnectionException(Throwable cause) {
        super(cause);
    }

    public HSMConnectionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
