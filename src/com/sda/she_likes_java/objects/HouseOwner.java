package com.sda.she_likes_java.objects;

public class HouseOwner {

    private String name;
    private House house;

    public HouseOwner(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}
