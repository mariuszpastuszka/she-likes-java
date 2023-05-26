package com.sda.she_likes_java.database;

public class TestRecord {

    private Integer id; // ID column from DB

    private String title; // name column from DB

    public TestRecord(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestRecord{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
