package com.zkdlu.practice01;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Nullable
    public String getNullableName() {
        return name;
    }

    @NotNull
    public String getNotNullName() {
        return name;
    }
}
