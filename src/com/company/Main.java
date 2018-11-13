package com.company;

public class Main {

    private static Person p2;

    public static void main(String[] args) {

        test();

        //System.gc();

        Person.Type type = Person.Type.STUDENT;
        Person person = PersonFactory.createRandomPerson();
        person.setType(type);
        System.out.println("My person: " + person);

        p2 =  new Person("asdf");

        p2.testNotStatic();

        Person.testStatic();

    }

    public static void test() {
        p2 = new Person("asdf");
        System.out.println(p2);
    }

}
