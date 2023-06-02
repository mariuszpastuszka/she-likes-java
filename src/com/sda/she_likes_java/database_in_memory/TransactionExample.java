package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {

        Connection connection = DbConnectionUtils.getConnection(DbCredentials.h2InMemoryUrl, DbCredentials.h2Username,
                DbCredentials.h2Password);

        try {
            connection.setAutoCommit(false);
            // insert some student's address
            // I've got exception here???
            // register student to exam
            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback(); // roll back already inserted records to db
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
