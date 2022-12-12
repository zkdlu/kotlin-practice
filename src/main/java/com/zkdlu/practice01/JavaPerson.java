package com.zkdlu.practice01;

public class JavaPerson {

    public static JavaPerson newBaby(String name) {
        return new JavaPerson(name, 1);
    }

    private final String name;
    private int age;


    public JavaPerson(final String name, final int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }
}
