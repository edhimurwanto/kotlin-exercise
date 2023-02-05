package com.academy.edhi.handson

enum class Direction {
    NORTH,
    WEST,
    SOUTH,
    EAST
}

// initialized with any value
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {
    println(Color.BLUE)
    println(Direction.EAST)
}
