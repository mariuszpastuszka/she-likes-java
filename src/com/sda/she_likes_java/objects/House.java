package com.sda.she_likes_java.objects;

public class House {
    private int numberOfRooms;
    private int numberOfBathrooms;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public House(int numberOfRooms, int numberOfBathrooms) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
