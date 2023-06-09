package com.sda.she_likes_java.final_project.repository;

import com.sda.she_likes_java.final_project.entity.BookingRecord;

import java.util.HashMap;
import java.util.Map;

public class BookingRecordRepository {

    private static long lastId;
    private Map<Long, BookingRecord> recordMap;

    public BookingRecordRepository() {
        recordMap = new HashMap<>();
    }
    public BookingRecord storeBookingRecord(BookingRecord record) {
        // TODO: use db
        long id = nextId();
        record.setBookingId(id);

        recordMap.put(id, record);
        return record;
    }

    private static long nextId() {
        return ++lastId;
    }
}
