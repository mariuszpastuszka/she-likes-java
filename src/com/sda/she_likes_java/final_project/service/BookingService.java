package com.sda.she_likes_java.final_project.service;

import com.sda.she_likes_java.final_project.repository.BookingRecordRepository;

public class BookingService {

    private final BookingRecordRepository bookingRecordRepository;

    // dependency injection - providing collaborators
    public BookingService(BookingRecordRepository bookingRecordRepository) {
        this.bookingRecordRepository = bookingRecordRepository;
    }

    public void bookCar() {
        System.out.println("New car booking");
    }
}
