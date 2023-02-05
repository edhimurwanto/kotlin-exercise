package com.academy.edhi.handson.oop

abstract class Animals {

    var name = ""

    abstract fun scream()

    fun printName(){
        println(this.name)
    }

}

class Birds(): Animals(){
    override fun scream() {
        println("Cuit cuit...")
    }

}

fun main() {

    val bird = Birds()
    bird.name = "Cicit"
    bird.printName()
    bird.scream()

}