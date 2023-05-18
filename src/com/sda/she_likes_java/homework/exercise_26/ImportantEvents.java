package com.sda.she_likes_java.homework.exercise_26;

import java.time.LocalDate;

public enum ImportantEvents {
    WEDDING(LocalDate.of(2007, 9, 29), "My wedding"),
    BIRD_OF_FIRST_SON(LocalDate.of(2011, 6, 25), "Mikołaj's birth"),
    BIRD_OF_SECOND_SON(LocalDate.of(2012, 7, 12), "Michał's birth"),
    BIRD_OF_DAUGHTER(LocalDate.of(2017, 4, 25), "Maria's birth");

    private final LocalDate eventDate;

    private final String description;

    ImportantEvents(LocalDate eventDate, String description) {
        this.eventDate = eventDate;
        this.description = description;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getDescription() {
        return description;
    }
}
