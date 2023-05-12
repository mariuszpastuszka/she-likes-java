package com.sda.she_likes_java.homework.exercise_23;

import java.util.*;

public class ClassroomJournal {

    private final Set<Pupil> pupils;
    private final Set<Subject> subjects;
    private final Map<Pupil, Set<Subject>> pupilSubjects;
    private final Map<Pupil, List<SubjectGrades>> pupilsGradeFromSubject;

    public ClassroomJournal() {
        pupils = new HashSet<>();
        subjects = new HashSet<>();
        pupilSubjects = new HashMap<>();
        pupilsGradeFromSubject = new HashMap<>();
    }

    public Set<Pupil> getAllPupils() {
        return pupils;
    }

    public Set<Subject> getAllSubjects() {
        return subjects;
    }

    public Set<Subject> getPupilSubjects(Pupil pupil) {
        return pupilSubjects.get(pupil);
    }

    public List<Grade> getPupilGrades(Pupil pupil, Subject subject) {
        List<SubjectGrades> subjectsWithGrades = pupilsGradeFromSubject.get(pupil);

        if (subjectsWithGrades == null) {
            System.out.printf("Student [%s] is not assigned to subject [%s]%n", pupil, subject);
            return List.of();
        }
        // find right subject
        for (SubjectGrades subjectGrades : subjectsWithGrades) {
            if (subjectGrades.getSubject().equals(subject)) {
                return subjectGrades.getGrades();
            }
        }
        return List.of();
    }
}
