package com.zkdlu.practice01;

public interface JavaSwimable {
    default void act() {
        System.out.println("어푸");
    }
}
