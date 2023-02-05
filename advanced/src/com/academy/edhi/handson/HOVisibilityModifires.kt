package com.academy.edhi.handson

fun main() {
    printMyName();
}

fun printMyName(){

    // when myClass is protected then not visible
    val myClass = MyClass()

    // internal printMyName is visible bacuse in same module
     myClass.printMyName()

    // private name, then not visible here
    // println(myClass.name)

    // protected age, then not visible here
    //  println(myClass.age)

    //    this will error because MyPrivateClass is private and in different file
    //    val myPrivateClass = MyPrivateClass()
    //    println(myPrivateClass.name)


}