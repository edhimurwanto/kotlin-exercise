package com.academy.edhi.handson

// Not use SAM Convertions
val isEven = object : IntPredicate {
    override fun accept(int: Int): Boolean {
        return int % 2 == 0
    }
}

// use SAM Convertions
val isEvenTwo = IntPredicate { it % 2 == 0}

fun main() {
    var int = 12
    isEvenTwo.accept(int)
    println(isEvenTwo.accept(int))
}