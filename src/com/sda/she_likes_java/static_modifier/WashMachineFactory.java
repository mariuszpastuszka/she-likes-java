package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {

    public static void main(String[] args) {
//        WashMachine.getModel();
        System.out.println("Current number of wash machines is: " + WashMachine.getNumberOfCreatedMachines());
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        System.out.println("Current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung serial number is: " + samsung.getSerialNumber());
        samsung.setSerialNumber(5);
        // DO NOT USE INSTANCE REFERENCES TO ACCESS STATIC MEMBERS (FIELDS/METHODS)
        samsung.setNumberOfCreatedMachines(1000);
        samsung.increaseSerialNumber();

        WashMachine samsung2 = new WashMachine("Samsung", "222222222");
        System.out.println("Current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung2 serial number is: " + samsung2.getSerialNumber());
        samsung2.increaseSerialNumber();

        for (int i = 0; i < 10; i++) {
            makeSomeWashMachines();
        }

        // some generic way to obtain number of produced washmachines
        System.out.println("Hey we've made lots of wash machines: " + WashMachine.getNumberOfCreatedMachines());
    }

    public static void makeSomeWashMachines() {
        new WashMachine("LG", "1111");
        new WashMachine("LG", "112");
        new WashMachine("LG", "113451");
        new WashMachine("LG", "14551");
        new WashMachine("LG", "114555");
    }
}
