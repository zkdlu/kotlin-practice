package com.zkdlu.practice01;

public class JavaCat extends JavaAnimal {

    public JavaCat(final String sepcies) {
        super(sepcies, 4);
    }

    @Override
    public void move() {
        System.out.println("고양고양");
    }
}
