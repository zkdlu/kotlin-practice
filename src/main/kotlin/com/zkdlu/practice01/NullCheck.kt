package com.zkdlu.practice01

fun main() {

}

fun startsWithA1(str: String?): Boolean {
    if (str == null)
        throw IllegalArgumentException()

    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null)
        return null

    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null)
        return false

    return str.startsWith("A")
}