package com.zkdlu.fp

fun main() {
    val extension: String = "abc";
    println(extension.lastChar())
    println(extension.lastCharacter)

    println(3 add2 2)

    val a: Int = 3
    a.add(2)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

val String.lastCharacter: Char
    get() = this[this.length - 1]

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add(other: Int): Int {
    return this + other
}