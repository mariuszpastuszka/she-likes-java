package com.sda.she_likes_java.sorting;

import java.util.Objects;

public class House implements Comparable<House> {

    private int numberOfRooms;

    private int numberOfFloors;

    private int numberOfBathrooms;

    private String address;

    public House(int numberOfRooms, int numberOfFloors, int numberOfBathrooms, String address) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", address='" + address + '\'' +
                '}';
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (numberOfRooms != house.numberOfRooms) return false;
        if (numberOfFloors != house.numberOfFloors) return false;
        if (numberOfBathrooms != house.numberOfBathrooms) return false;
        return Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        int result = numberOfRooms;
        result = 31 * result + numberOfFloors;
        result = 31 * result + numberOfBathrooms;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(House o) {
        return numberOfBathrooms - o.numberOfBathrooms;
    }
}
