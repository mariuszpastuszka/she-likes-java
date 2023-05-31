package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInit {

    private static final String createTableQuery = """
            CREATE TABLE STUDENTS
            (
                ID INT PRIMARY KEY AUTO_INCREMENT,
                NAME VARCHAR(255) NOT NULL,
                SURNAME VARCHAR(255) NOT NULL,
                AGE INT NOT NULL DEFAULT 0,
                SEX VARCHAR(255));
            """;

    private static final String insertDataQuery = """
            INSERT INTO STUDENTS (NAME, SURNAME, SEX) VALUES ('Olek', 'S.', 'MALE');
            INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Marek', 'W.', 25, 'MALE');
            INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Alina', 'G.', 18, 'FEMALE');
            INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Anna', 'F.', 35, 'FEMALE');
            INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('EWELINA', 'A.', 40, 'FEMALE');                       
            """;

    public static void prepareData(Connection dbConnection) {
        try {
            Statement statement = dbConnection.createStatement();

            // create table
            statement.execute(insertDataQuery);
            statement.execute(createTableQuery);
            // insert data to table
        } catch (SQLException e) {
            System.out.println("Problem with preparing new data: " + e);
        }
    }
}
