package com.sda.she_likes_java.arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        int d = 1;
        int e = 3;

        // create an array (set) of 5 values
        // for int type default value is: 0
        // indexes starts at 0 till 4
        int[] numbers = new int[5];
        System.out.println("first element from array is: " + numbers[0]);
        System.out.println("last element is always: array size - 1");
//        System.out.println("is it correct to use numbers[5]?? " + numbers[5]);
        System.out.println("Is this line printed??");

        System.out.println("Trying to init array");
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 150;
        numbers[3] = 225;
        numbers[4] = 25;

        System.out.println("number[4] is: " + numbers[4]);

        System.out.println("size of the numbers array is: " + numbers.length);

        // arrays have fixed size, they cannot grow
        //        numbers.length = 10;
    }
}
