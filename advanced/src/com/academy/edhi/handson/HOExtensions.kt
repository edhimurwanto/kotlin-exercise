package com.academy.edhi.handson

fun main() {

    val numbers = mutableListOf<Int>(1, 2, 3, 4)
    numbers.swap(0, 2)
    println(numbers.joinToString())

    val colors = mutableListOf<String>("green", "blue", "red")
    colors.swap(0,2)
    println(colors.joinToString())


}

// this visible to receive any type then we create new generic type
//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//
//    var temp = this[index1] // this correspondent to the list
//    this[index1] = this[index2]
//    this[index2] = temp
//
//}

fun <T> MutableList<T>.swap(index1: Int, index2: Int){
    var temp = this[index1] // this correspondent to the list
    this[index1] = this[index2]
    this[index2] = temp
}