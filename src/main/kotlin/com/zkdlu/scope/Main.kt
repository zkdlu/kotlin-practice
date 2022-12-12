package com.zkdlu.scope

import com.zkdlu.oop.Person


fun main() {
    val person = Person()

    val value1 = person.let {
        it.age
    }
    println(value1)

    val value2 = person.run {
        this.age
    }
    println(value2)

    val value3 = person.also {
        it.age
    }
    println(value3)

    val value4 = person.apply {
        this.age
    }
    println(value4)

    with(person) {
        println(name)
        println(this.age)
    }
}