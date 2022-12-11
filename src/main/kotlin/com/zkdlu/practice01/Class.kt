package com.zkdlu.practice01

fun main() {
    val person = Person("ABC")

    println(startsWithA(person.name))
//    println(startsWithA(person.nullableName))
    println(startsWithA(person.notNullName))
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}