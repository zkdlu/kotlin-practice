package com.zkdlu.expression


fun main() {
    println(getPassOrFail(100))
    println(getPassOrFail(40))

    validateScore(100)
    validateScore(1)

    println(getGradeWithSwitch(100))
    println(getGradeWithSwitch(80))
}

fun getPassOrFail(score: Int): String {
    return if (score > 50) {
        "P"
    } else {
        "F"
    }
}

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException()
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99, 100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("0")
        number % 2 == 0 -> println("짝수")
        else -> println("")
    }
}