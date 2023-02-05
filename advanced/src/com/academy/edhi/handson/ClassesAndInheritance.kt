package com.academy.edhi.handson

import com.academy.edhi.entities.Person

fun main() {

    var edi = Person("Edi")
    var daughter = Person("Dewi", edi)
    println(edi)

    val empty = Empty()
    println(empty)

    val gender = Gender()
    println(gender.gender)

    val base =Base("Edi")
    val derived = Derived("Edi", "Murwanto")

}

// class with body but no primary constructor
class Gender {
    val gender = "MALE"
}

// class with no body
class Empty

// Faktanya, kita bisa melakukan inisialisasi didalam primary constuctor dengan cara berikut:
class People(val firstName: String, val lastName: String, var age: Int) { 

}

class Hero {
  
    val fullName : String

    constructor(fullName: String){
        this.fullName = fullName
    }

}

// Faktanya, inisialisasi didalam primary constuctor
// class Hero(
//   val fullName, 
//   var age: Int
// ) { }

open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
        name: String,
        val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        super.size
        println("Initializing Derived") }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}