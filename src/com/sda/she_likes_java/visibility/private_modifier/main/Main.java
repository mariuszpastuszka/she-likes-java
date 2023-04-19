package com.sda.she_likes_java.visibility.private_modifier.main;

import com.sda.she_likes_java.visibility.private_modifier.cars.Car;

public class Main {

    public static void main(String[] args) {
        Car funnyCar = new Car();
        // brand is private so not visible outside the class
//        funnyCar.brand
//        funnyCar.setBrand("toyota");

        funnyCar.model = "corolla";

        // cannot see colour from outside its class package
//        funnyCar.colour = "pink";
    }
}
