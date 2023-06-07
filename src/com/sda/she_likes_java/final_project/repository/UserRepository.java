package com.sda.she_likes_java.final_project.repository;

import com.sda.she_likes_java.final_project.entity.User;
import com.sda.she_likes_java.final_project.exception.InexperiencedUserException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private static long userCounter;
    private Map<Long, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    private static long nextId() {
        return ++userCounter;
    }

    public void registerNewUser(String name,
                                String surname,
                                LocalDate dateOfBirth,
                                String login,
                                String password,
                                LocalDate drivingLicenseIssueDate) throws InexperiencedUserException {
        checkDrivingLicense(drivingLicenseIssueDate);

        Long id = nextId();

        registerUser(name, surname, dateOfBirth, login, password, drivingLicenseIssueDate, id);
    }

    private void registerUser(String name, String surname, LocalDate dateOfBirth, String login, String password, LocalDate drivingLicenseIssueDate, Long id) {
        User newUser = new User(id, name, surname, dateOfBirth, login, password, drivingLicenseIssueDate);
        users.put(id, newUser);
    }

    private void checkDrivingLicense(LocalDate drivingLicenceIssueDate) throws InexperiencedUserException {
        // at least 3 years:)
        final int requiredNumberOfYears = 3;
        LocalDate currentDate = LocalDate.now();
//        drivingLicenceIssueDate + 3 year is before now
        LocalDate boundaryDate = drivingLicenceIssueDate.plusYears(requiredNumberOfYears);

        if (boundaryDate.isAfter(currentDate)) {
            throw new InexperiencedUserException("Better buy a bicycle!");
        }
    }

    public void deleteUser() {
        // TODO
    }

    // TODO
    public List<User> listAllUsers() {
        return List.of();
    }

    public void updateUser(User user) {
        // TODO
    }

    // TODO
    public List<User> getUsersBasedOnCriteria() {
        return List.of();
    }

    // TODO
    public List<User> getOrderedUsers(Comparator<User> comparator) {
        return List.of();
    }
}
