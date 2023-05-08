package com.sda.she_likes_java.collections;

import java.util.Objects;

public class Trousers {

    private final String material;

    private final String brand;

    public Trousers(String material, String brand) {
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trousers trousers = (Trousers) o;

        if (!Objects.equals(material, trousers.material)) return false;
        return Objects.equals(brand, trousers.brand);
    }

    @Override
    public int hashCode() {
        int result = material != null ? material.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
