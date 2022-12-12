package com.zkdlu.collection

fun main() {
    val array = arrayOf(100, 200)
    array.plus(300)

    for (i in array.indices) {
        println("${i} -> ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx -> $value")
    }

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }


    val mutableList = mutableListOf(100, 200)
    mutableList.add(300)

    for (number in mutableList) {
        println(number)
    }

    val set = setOf(100, 200)
    for (number in set) {
        println(number)
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val map = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, entry) in oldMap.entries) {
        println("$key $entry")
    }
}

private fun printNumbers(numbers: List<Int>) {
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }
}