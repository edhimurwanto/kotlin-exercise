package com.academy.edhi.handson

fun main() {

    val outer = Outer()
    val nested = Outer.Nested()
    println(outer.foo())
    println(nested.foo())



}

class Outer {

    fun foo(){
        print("Outer class")
    }

    class Nested {
        fun foo(){
            print("Nested class")
        }
    }
}