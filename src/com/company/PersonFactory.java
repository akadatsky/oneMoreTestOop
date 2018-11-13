package com.company;

import java.util.Random;

public class PersonFactory {

    private static String[] names = {"Alex", "Oleg", "Olga"};

    private static Random random = new Random();

    public static Person createRandomPerson() {
        String name = names[random.nextInt(names.length)];
        Person person = new Person(name);
        return person;
    }

}
