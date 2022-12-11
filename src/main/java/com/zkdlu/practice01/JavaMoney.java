package com.zkdlu.practice01;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney>{

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;

        final JavaMoney javaMoney = (JavaMoney) o;

        return amount == javaMoney.amount;
    }

    @Override
    public int hashCode() {
        return (int) (amount ^ (amount >>> 32));
    }
}
