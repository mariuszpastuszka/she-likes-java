package com.sda.she_likes_java.final_project.service;

import com.sda.she_likes_java.final_project.configuration.CarRecordConfig;
import com.sda.she_likes_java.final_project.entity.*;
import com.sda.she_likes_java.final_project.repository.BookingRecordRepository;

import java.time.Duration;
import java.time.LocalDate;

public class BookingService {

    private final BookingRecordRepository bookingRecordRepository;

    // dependency injection - providing collaborators
    public BookingService(BookingRecordRepository bookingRecordRepository) {
        this.bookingRecordRepository = bookingRecordRepository;
    }

    public BookingRecord bookCar(User user,
                        Car carToBook,
                        LocalDate startDate,
                        LocalDate endDate,
                        boolean isPaid,
                        PayingMethod payingMethod) {
        System.out.println("New car booking");

        // calculate the price for booking
        long bookingFinalPrice = calculateWholePrice(carToBook, startDate, endDate);

        // create booking record
        BookingRecord bookingRecord = new BookingRecord(null, user, carToBook, startDate,
                endDate, bookingFinalPrice, isPaid, payingMethod);

        return bookingRecordRepository.storeBookingRecord(bookingRecord);
    }

    private static long calculateWholePrice(Car carToBook, LocalDate startDate, LocalDate endDate) {
        PriceCategory priceCategory = carToBook.category();
        long pricePerDayInEuroCents = CarRecordConfig.getPricePerDayInEuroCents(priceCategory);
        Duration datesDuration = Duration.between(startDate, endDate);
        long numberOfDays = datesDuration.toDays();
        return pricePerDayInEuroCents * numberOfDays;
    }
}
