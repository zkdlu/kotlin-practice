package com.zkdlu.practice01;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable {
    private final int wingCount;

    protected JavaPenguin(String sepcies) {
        super(sepcies, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄펭귄");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
