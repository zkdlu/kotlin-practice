package com.zkdlu.oop


abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}

class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이 야옹야옹")
    }
}

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int  = 2
    override fun move() {
        println("펭귄펭귄")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }
}

interface Flyable {
    fun act() {
        println("파닥파닥")
    }
}

interface Swimable {
    fun act() {
        println("어푸")
    }
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived")
    }
}

fun main() {
    Derived(300)
}