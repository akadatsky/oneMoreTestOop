package com.company;

public class Person {

    public enum Type {
        STUDENT, TEACHER
    }

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private String name;
    private int age;
    private Type type;


    public static void testStatic() {
        // age = 20;
    }

    public void testNotStatic() {
        age = 20;
    }


    public Person(String name) {
        this.name = name;
        Point point = new Point(100, 200);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
