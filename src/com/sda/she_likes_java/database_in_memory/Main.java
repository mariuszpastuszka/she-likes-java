package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Connection connection = DbConnectionUtils.getConnection(DbCredentials.h2InMemoryUrl,
                DbCredentials.h2Username, DbCredentials.h2Password);

        System.out.println("Do we have connection? " + (connection != null));

        DbInit.prepareData(connection);
    }
}
