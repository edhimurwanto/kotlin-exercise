package com.academy.edhi.handson.oop

class Car(){

    var fuel: Int = 0
    /** manual getter setter **/
    set(value) {
        field = value
    }

    get() = field

    var engineStatus = "Off"
    private set

    fun startEngine(){
        println("Engine starting. . .")
        if(fuel > 0 ){
            this.engineStatus = "ON"
            println("Engine started, engine status : $engineStatus")
            return // exit from this function
        }
        println("Engine failed to start, fuel is empty")

    }

}

fun main() {
    var car = Car()
//    car.engineStatus = "ON"
    car.fuel = 20

    car.startEngine()
}