package com.sda.she_likes_java.homework.exercise_22;

import java.util.Objects;

public class Item {

    private String name;
    private double priceInUSD;

    public Item(String name, double priceInUSD) {
        this.name = name;
        this.priceInUSD = priceInUSD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.priceInUSD, priceInUSD) != 0) return false;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(priceInUSD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", priceInUSD=" + priceInUSD +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }
}
