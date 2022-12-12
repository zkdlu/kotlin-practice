package com.zkdlu.oop


fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    class LivingRoom(
        private val area: Double
    )
}

class InnerHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(
        private val area: Double
    ) {
        val address:String
            get() = this@InnerHouse.address
    }
}
