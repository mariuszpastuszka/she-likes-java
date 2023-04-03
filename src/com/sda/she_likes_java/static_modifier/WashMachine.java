package com.sda.she_likes_java.static_modifier;

public class WashMachine {
    private static int numberOfCreatedMachines;
    private String brand;
    private String model;
    private int serialNumber;

    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;
        serialNumber++;
    }

    public static void setNumberOfCreatedMachines(int numberOfCreatedMachines) {
        WashMachine.numberOfCreatedMachines = numberOfCreatedMachines;
    }

    // instance method
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // class method
    public static int getNumberOfCreatedMachines() {
        return numberOfCreatedMachines;
    }

    // instance method
    public int getSerialNumber() {
        return serialNumber;
    }

    // instance method
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // instance method
    public void increaseSerialNumber() {
        serialNumber++;
    }

    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
