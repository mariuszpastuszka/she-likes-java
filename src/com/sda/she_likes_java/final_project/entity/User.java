package com.sda.she_likes_java.final_project.entity;

import java.time.LocalDate;

public record User(String name, String surname, LocalDate dateOfBirth, String login, String password,
                   LocalDate drivingLicenseIssueDate) {

}
