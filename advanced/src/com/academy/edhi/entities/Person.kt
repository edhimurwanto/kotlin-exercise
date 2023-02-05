package com.academy.edhi.entities

// class with primary constructor and type paramente firstName
// If class have no annotation, constructor keyword can be ommited.
class Person constructor(firstName: String){

    // read only
    val myName = "Edi Murwanto"

    // can re assign
    var age = 20
    var firstName: String = ""
    var childrens: MutableList<Person> = mutableListOf<Person>()

    // secondary constructor
    constructor(firstName: String, parent: Person): this(firstName){
        parent.childrens.add(this@Person)
    }

    init {
        this.firstName = firstName
    }

    override fun toString(): String {
        return "First Name : $firstName, childrens : $childrens"
    }

}