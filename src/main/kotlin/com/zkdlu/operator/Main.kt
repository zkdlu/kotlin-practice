package com.zkdlu.operator

import com.zkdlu.practice01.JavaMoney


fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)
    val money3 = JavaMoney(1_000L)
    val money4 = money1

    if (money1 < money2) {
        println("크다")
    }

    if (money1 == money3)
        println("동등")

    if (money1 === money4)
        println("동일")
}