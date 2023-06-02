package com.sda.she_likes_java.database_in_memory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// CRUD
// Create
// Read
// Update
// Delete
public class AccentureStudentsRepository {

    private static final String allStudentsQuery = """
            SELECT ID, NAME, SURNAME, AGE, SEX
            FROM STUDENTS;
            """;

    private static final String insertStudentQuery = """
            INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX)
            VALUES(?, ?, ?, ?)
            """;

    private Connection dbConn;

    public AccentureStudentsRepository(Connection dbConn) {
        this.dbConn = dbConn;
    }

    public List<AccentureStudent> getAllStudents() {
        List<AccentureStudent> result = new ArrayList<>();
        try {
            Statement statement = dbConn.createStatement();
            ResultSet recordsFromDb = statement.executeQuery(allStudentsQuery);

            while (recordsFromDb.next()) {
                Integer id = recordsFromDb.getInt("ID");
                String name = recordsFromDb.getString("NAME");
                String surname = recordsFromDb.getString("SURNAME");
                int age = recordsFromDb.getInt("AGE");
                String sex = recordsFromDb.getString("SEX");

                AccentureStudent student = new AccentureStudent(id, name, surname, age, sex);
                result.add(student);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected error: " + e);
        }
        return result;
    }

    public AccentureStudent getStudentById(Long id) {
        return null;
    }

    public AccentureStudent saveStudent(AccentureStudent student) {
        try {
            dbConn.setAutoCommit(false);
            // preparing insert query
            PreparedStatement preparedStatement = dbConn.prepareStatement(insertStudentQuery);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getStudentsAge());
            preparedStatement.setString(4, student.getSex());

            // send query to db
            int numberOfInsertedRecords = preparedStatement.executeUpdate();

            // get id of created record
            ResultSet generatedId = preparedStatement.getGeneratedKeys();
            while (generatedId.next()) {
                Integer id = generatedId.getInt("ID");
                student.setId(id);
            }
            dbConn.commit();
        } catch (SQLException e) {
            try {
                dbConn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("Inserted student is: " + student);
        return student;
    }

    public boolean deleteStudentById(Long id) {
        return true;
    }

    public AccentureStudent updateStudent(AccentureStudent student) {
        return null;
    }
}
