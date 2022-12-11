package com.zkdlu.practice01

fun main() {

    val str: String? = null
    println(str?.length)

    val str2: String? = "ABC"
    println(str2?.length)

    val str3: String? = null
    println(str3?.length ?: 0)

    println(startsWith("ABC"))
    println(startsWith("BBC"))
    println(startsWith(null))
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException()
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}