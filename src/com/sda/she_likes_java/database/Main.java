package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection con1 = DatabaseUtils.getConnection();

        try {
            DatabaseUtils.getConnectionButSometimesThrowException();
        } catch (SQLException e) {
            System.out.println("I NEED TO HANDLE IT!!!");
        }
    }
}
