package com.academy.edhi.handson

class Vehichle {
    var brand = "Vehicle"
    class Car {
        var name = "Car"
    }

    inner class Motor {
        fun gas() = "Gasssss"
    }
}

fun main() {
    println(Vehichle.Car().name)
    println(Vehichle().Motor().gas())
}