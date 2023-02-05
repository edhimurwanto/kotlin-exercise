package com.academy.edhi.handson

data class Car(var name:String, var machine: String){

    var year = 0

    override fun toString(): String {
        return "$machine $name"
    }

}

fun main() {
    var myToyotaCar = Car("Avanza", "Toyota")
    println(myToyotaCar)

    var hondaJazz = myToyotaCar.copy(name = "Jazz")
    println(hondaJazz)


}