package com.academy.edhi.handson.oop

open class Animal {

    var name: String = ""
    var type: String = ""

}

class Cat(): Animal(){

}

fun main() {

    val cat = Cat()
    cat.name = "Pussi"
    cat.type = "Anggora"

    println(cat.name)
}