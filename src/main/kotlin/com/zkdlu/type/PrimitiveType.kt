package com.zkdlu.type

fun main() {
    val num1 = 3 // Int
    val num2 = 1L // Long

    val num3: Long = num1.toLong()


    val num4: Int? = 3
    val num5: Long = num4?.toLong() ?: 0L
}