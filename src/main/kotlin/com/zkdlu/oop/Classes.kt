package com.zkdlu.oop


fun main() {
    val dataClass = PersonDto("이건", 25)
    val dataClass2 = PersonDto("이건", 25)
    println(dataClass)
    println(dataClass == dataClass2)

}

data class PersonDto(
    val name: String,
    val age: Int
)

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("kor")
        Country.AMERICA -> println("us")
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)

fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> println("avante")
        is Sonata -> println("sonata")
    }
}