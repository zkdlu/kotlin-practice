package com.zkdlu.oop

import com.zkdlu.practice01.JavaPerson

fun main() {
    val person = Person("이건", 25)
    println(person.name)
    person.age = 10
    println(person.age)

    val javaPerson = JavaPerson("이건", 25)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)

    val p1 = Person("이름")
    val p2 = Person()
}

class Person(
    name: String = "이건",
    var age: Int = 25
) {
    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }


    init {
        if (age <= 0) {
            throw IllegalArgumentException()
        }

        println("초기화")
    }

    constructor(name: String): this(name, 1) {
        println("부생성자 1")
    }

    constructor(): this("이름") {
        println("부생성자 2")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}
