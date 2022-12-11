package com.zkdlu.function


fun main() {
    println(max(1, 2))

    repeat("Hello", 3, true)
    repeat("Hello")
    repeat("Hello", 5, false)

    repeat("Hello", useNewLine = false)

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}