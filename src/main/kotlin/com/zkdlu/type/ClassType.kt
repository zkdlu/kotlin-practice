package com.zkdlu.type

import com.zkdlu.practice01.Person

fun main() {
    printNameIfPerson2(null)
    printNameIfPerson2(Person("hi"))

    val person = Person("안녕")
    println("이름은 ${person.name}")
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