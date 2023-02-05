package com.academy.edhi.handson

fun main() {

    // list
    val fruits = listOf<String>("Apple", "Mango", "Banana", "Apple")

    println(fruits[0]) // Apple
    println(fruits[1]) // Mango
    println(fruits[3]) // Apple

    // mutableList
    val animals = mutableListOf<String>()
    animals.add("Cat")
    animals.add("Bird")
    println(animals[0]) // Cat

    animals.removeAt(0) // remove Cat at index 0
    println(animals[0]) // Bird

    // set
    var alphabet = setOf<Char>('A', 'B', 'A')
    println(alphabet) // [A, B]
    alphabet = alphabet.plus('C')
    println(alphabet) // [A, B, C]

    // mutableList
    val numbers = mutableSetOf(1,2,3,4,5,6,1,2,3)
    val numbers2 = mutableSetOf(1,2,3,4,5,6)
    println(numbers)
    println( numbers == numbers2)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap == anotherMap}")

    // map
    val student = mapOf("id" to 1, "name" to "Doni", "gender" to "Male")
    println(student["id"])
    println(student["name"])

    val person = mutableMapOf("id" to "2", "name" to "John")
    person["gender"] = "Male"
    println(person)
}