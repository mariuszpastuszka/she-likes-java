package com.sda.she_likes_java.database;

import java.sql.Connection;

public class TestRecordProgram {

    public static void main(String[] args) {
        Connection connection = DatabaseUtils.getConnection();
        System.out.println("got connection? " + (connection != null));

        TestRecordRepository recordRepository = new TestRecordRepository(connection);
        recordRepository.getAllTestRowsFromDB();

        System.out.println("Let's store some data");
        TestRecord newRecord = new TestRecord(10, "First insert");
        recordRepository.storeTestRecordIntoDatabase(newRecord);

        System.out.println("Reading data from db after insert");
        recordRepository.getAllTestRowsFromDB();
    }
}
