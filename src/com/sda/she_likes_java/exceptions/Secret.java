package com.sda.she_likes_java.exceptions;

import java.time.LocalDateTime;
import java.util.Objects;

public class Secret {

    private final LocalDateTime timestamp;
    private final String ourSecret;

    public Secret(LocalDateTime timestamp, String ourSecret) {
        this.timestamp = timestamp;
        this.ourSecret = ourSecret;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Secret secret = (Secret) o;

        if (!Objects.equals(timestamp, secret.timestamp)) return false;
        return Objects.equals(ourSecret, secret.ourSecret);
    }

    @Override
    public int hashCode() {
        int result = timestamp != null ? timestamp.hashCode() : 0;
        result = 31 * result + (ourSecret != null ? ourSecret.hashCode() : 0);
        return result;
    }

    public String getOurSecret() {
        return ourSecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timestamp=" + timestamp +
                ", ourSecret='" + ourSecret + '\'' +
                '}';
    }
}
