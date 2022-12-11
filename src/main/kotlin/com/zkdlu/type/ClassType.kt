package com.zkdlu.type

import com.zkdlu.practice01.Person

fun main() {
    printNameIfPerson2(null)
    printNameIfPerson2(Person("hi"))

    val person = Person("안녕")
    println("이름은 ${person.name}")

    val str = """
        ABCD
        EFG
        asdfasdlkfjskdjf;akj
        123124
    """.trimIndent()

    println(str)
    println(str[1])
}

fun printNameIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.name ?: "not")
}

fun printNameIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.name)
    }

    if (obj !is Person) {
        println("not")
    }
}