package com.sda.she_likes_java.final_project;

import com.sda.she_likes_java.final_project.repository.BookingRecordRepository;
import com.sda.she_likes_java.final_project.service.BookingService;

public class BookingApplication {

    public static void main(String[] args) {
        System.out.println("Booking application started");

        BookingRecordRepository bookingRecordRepository = new BookingRecordRepository();
        BookingService bookingService = new BookingService(bookingRecordRepository);
    }
}
