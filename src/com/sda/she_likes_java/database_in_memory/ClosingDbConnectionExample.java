package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.SQLException;

public class ClosingDbConnectionExample {

    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
//
//        handleString("abcd");
//        handleString(null);
        Connection connection = null;
        try {
            connection = DbConnectionUtils.getConnectionRiskyWay(DbCredentials.h2InMemoryUrl,
                    DbCredentials.h2Username, DbCredentials.h2Password);
        } catch (SQLException e) {
            System.out.println("Some exception: " + e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("Now let's use better way to close connection - available since Java 7");
        System.out.println("Try with resources construction");
        try (Connection conn = DbConnectionUtils.getConnectionRiskyWay(DbCredentials.h2InMemoryUrl,
                DbCredentials.h2Username, DbCredentials.h2Password)) {

        } catch (SQLException e) {
            System.out.println("Some exception: " + e);
        }
    }

    private static void handleString(String string) {
        if (string != null) {
            System.out.println("String length is: " + string.length());
        }
    }
}
