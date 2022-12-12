package com.zkdlu.practice01;

public abstract class JavaAnimal {
    protected final String sepcies;
    protected final int legCount;

    protected JavaAnimal(final String sepcies, final int legCount) {
        this.sepcies = sepcies;
        this.legCount = legCount;
    }
    abstract public void move();

    public String getSepcies() {
        return sepcies;
    }

    public int getLegCount() {
        return legCount;
    }
}
