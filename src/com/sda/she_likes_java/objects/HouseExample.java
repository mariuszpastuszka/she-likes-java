package com.sda.she_likes_java.objects;

public class HouseExample {

    public static void main(String[] args) {
        House myHouse = new House(4, 2);
        myHouse.setNumberOfFloors(2);
        System.out.println("I've got new house: " + myHouse);

        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");
        System.out.println("I need more rooms...");
        myHouse.setNumberOfRooms(5);

        System.out.println("Hey, I've got more rooms now...");
        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");

        System.out.println("=======================================");
        HouseOwner wife = new HouseOwner("Mary", myHouse);
        HouseOwner husband = new HouseOwner("Jack", myHouse);

        System.out.println("Mary would like to repair her house");
        wife.getHouse().setNumberOfBathrooms(3); // House house = wife.getHouse(); house.setNumberOfBathrooms(3);
        System.out.println("Currently the house looks like this: " + myHouse);

        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("Currently the house looks like this: " + myHouse);

        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);

//        String haha = new House(1, 2);
        myHouse = new House(1, 1);
        System.out.println("Now myHouse reference: " + myHouse);
        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);

        myHouse = new House(10, 10);
        wife.setHouse(myHouse);
        System.out.println("Mary: " + wife);
        System.out.println("Jack: " + husband);
        wife.setHouse(husband.getHouse());
    }
}
