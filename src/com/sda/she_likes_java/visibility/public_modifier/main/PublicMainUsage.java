package com.sda.she_likes_java.visibility.public_modifier.main;

import com.sda.she_likes_java.visibility.public_modifier.drivers.ProfessionalDriver;

public class PublicMainUsage {

    public static void main(String[] args) {
        // because ProfessionalDriver class is public we're able to use it outside its package
        ProfessionalDriver me = new ProfessionalDriver();

    }
}
