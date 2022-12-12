package com.zkdlu.oop


class Car private constructor (
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}