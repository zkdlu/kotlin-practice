package com.zkdlu.oop

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    log(object : Log {
        override fun log() {
            println("로그")
        }
    })
}

class StaticPerson private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): StaticPerson {
            return StaticPerson(name, MIN_AGE)
        }

        override fun log() {
            println("person log")
        }
    }
}


object Singleton {
    var a: Int = 0
}

private fun log(log: Log) {
    log.log()
}