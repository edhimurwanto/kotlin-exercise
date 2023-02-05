package com.academy.edhi.resume

/*

Properties and Fields

Declaring properties
Can use var for mutable or val for read-only
Can access with call the instance name . property name

Getter and Setter
Getter and setter is optional, when properties declared with a value, then default getter and setter are declared too.
    For instance:
        var allByDefault: Int? // error: explicit initializer required, default getter and setter implied
        var initialized = 1 // has type Int, default getter and setter

For read only use val keyword, because it not provide setter
        val simple: Int? // has type Int, default getter, must be initialized in constructor
        val inferredType = 1 // has type Int and a default getter

We can declare custom getter, and it will called when we access the property
    val isEmpty: Boolean
        get() = this.size == 0

Custom setter too, by convention parameter name of setter is value, but you can change it
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // parses the string and assigns values to other properties
        }

Use lateinit modifier to declare variable that nullable value.



 */