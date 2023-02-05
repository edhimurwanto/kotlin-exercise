package com.academy.edhi.handson

fun main() {

    declareAndPrint()

}

fun declareAndPrint(){
    // read only
    val myName = "Edi Murwanto"

    // can re assign
    var age = 20
    age = 23

    println("$myName is $age years old.")
}