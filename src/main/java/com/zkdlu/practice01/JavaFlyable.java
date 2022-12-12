package com.zkdlu.practice01;

public interface JavaFlyable {
    default void act() {
        System.out.println("파닥파닥");
    }
}
