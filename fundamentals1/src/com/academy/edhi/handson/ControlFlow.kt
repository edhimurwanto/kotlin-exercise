package com.academy.edhi.handson

fun main() {
    val names = arrayOf("Edi", "Eza", "Tika", "Edo")

    for (i in names.indices) {
        println(i)
    }

    for (i in 1..20){
        if (i % 2 == 0){
            println(i)
        }
    }

//    names.forEachIndexed { i, v -> println("The value for index $i is $v") }

    for ((i, v) in names.withIndex()) {
        println("The value for index $i is $v")
    }
}

// if else
fun greeting(name: String){
    if(name == "Edi"){
        println("Hello $name")
    } else {
        println("Please tell your name.")
    }
}

// simplify if else
fun isEven(number: Int): Boolean {
    return (number % 2 == 0)
}

// like ternary
fun checkMaxValue(number: Int): Int{
    val currentMax = 30
    val max = if(number > currentMax) number else currentMax
    return max
}

// when with 1 case
fun checkWhatDay(day: String){
    when(day){
        "senin" -> println("Hari senin")
        "selasa" -> println("Hari selasa")
        "rabu" -> println("Hari rabu")
        else -> println("Bukan hari senin, selasa atau rabu")
    }
}

// when with 2 case or more
fun checkXisOneOrZero(x: Int){
    when(x){
        0,1,2 -> println("X == 0 atau X == 1 atau X == 2")
        else -> println("X not 0 or 1 or 2")
    }
}

// when with range-to
fun checkXInRangeTo(x : Int){
    when(x){
        in 1..10 -> println("x is in the range 1-10")
        in 10..20 -> println("x is not in the range 1-10 but 10-20")
        else -> println("x is $x")
    }
}

// when to check data type
fun hasPrefix(x: Any){
    when(x){
        is String -> println("has prefix")
        else -> println("have no prefix")
    }
}

// when to replace if else
fun checkOddOrEven(x: Int){
    when {
        (x == 0) -> println("X adalah bilangan netral.")
        (x % 2 == 0) -> println("X adalah bilangan genap.")
        else -> println("X adalah bilangan ganjil.")
    }
}

// for using in and range-to
fun exForUsingRangeTo(array: Array<String>){
    // will show error because array index out of bound, to solve using until
    for (i in 0..array.size){
        println(array[i])
    }

}

// for using until
fun exForUsingUntil(array: Array<String>){
    for (i in 0 until array.size){
        println(array[i])
    }
}

// for using step
fun exForUsingStep(){
    for (i in 1..20 step 2){
        println(i)
    }
}

// for using down to
fun exForUsingDownTo(){
    for (i in 20 downTo 0 step 2){
        println(i)
    }
}