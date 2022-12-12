package com.zkdlu.iterate

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }
    for (i in 1..5 step 2) {
        println(i)
    }

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    run {
        numbers.map { number -> number + 1 }
            .forEach { number ->
                if (number == 2L) {
                    return@run
                }

                if (number == 3L) {
                    return@forEach
                }

                println(number) }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("$i $j")
        }
    }

}