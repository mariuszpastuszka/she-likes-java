package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    /**
     * Script for creating table
     * CREATE TABLE TEST
     * (ID INT PRIMARY KEY, NAME VARCHAR(255));
     *
     * Script for inserting one record (row) into table
     * INSERT INTO
     * TEST(ID, NAME)
     * VALUES(1, 'Olga');
     *
     * Script for reading data
     * SELECT ID, NAME
     * FROM TEST;
     *
     * Script for updating data
     * UPDATE TEST -- name of table to update
     * SET NAME = 'Alma' -- column value to change
     * WHERE ID=2; -- selected row
     *
     * Script for deleting data
     * DELETE
     * FROM TEST
     * WHERE ID=3;
     */
    // handle internally
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
                    "sa",
                    "sa");
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    // declare
    public static Connection getConnectionButSometimesThrowException() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
                "sa",
                "sa");
    }
}
