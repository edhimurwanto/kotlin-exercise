package com.academy.edhi.resume

/*

Classes and inheritance

Classes
Dideklarasikan menggunakan keyword class

    class Invoice { ... }

Class bisa memiliki header yang berisi tipe parameter, atau primary constructor, dan body yang bungkus menggunakan
kurung kuwaral. Header dan body bersifat optional jika class tersebut tidak memiliki body maka kurung kurawal bisa
dihilangkan.
    class Empty

Constuctor
Class dapat berisi primary constructor dan satu atau lebih secondary constructor.
Jika class tidak memiliki annotation maka keyword constuctor pun bisa dihilangkan.
Primary constructor tidak boleh berisi suatu code, maka inisialisasi code dapat diletakkan
pada method init atau initializer blocks.

Faktanya, kita bisa melakukan inisialisasi didalam primary constuctor dengan cara berikut:
class Person(val firstName: String, val lastName: String, var age: Int) { ... }

Block inisialisasi lebih effective karena akan di execute sebelum secondary constructor dan bahkan jika class tidak
punya primary constructor init block tetap akan di execute.

Non-abstrack yang tidak ada primary atau secondary constructor akan secara otomatis mempunyai constructor dengan argument kosong
dan bersifat public, tapi bisa di private dengan mendeclare constructor dengan diawali private keyword.

Creating instances of class
    val customer = Customer("Joe Smith")
Note: Kotlin has no new keyword

Class members
Class bisa berisi
- constructor dan block init
- property
- method
- deklarasi object
- nested dan inner class

Inheritance
Semua class di Kotlin pada dasarnya adalah inheritance daripada class Any yang mana tidak memiliki
deklarasi supertype.
    class Example // Implicitly inherits from Any
Any mempunyai 3 method, equals, hashCode, toString.
Secara default class di Kotlin bersifat final, artinya tidak bisa di turunkan.
Agar class tersebut bisa diturunkan kita perlu menandai nya dengan menambahkan open keyword.
Untuk mendeklarasikan supertype secara ekplisit tambahkan nama class setelah titik dua
    open class Vehicle { }
    class Car : Vehicle { }

Jika class yang diturunkan mempunyai primary constructor maka class turunanya bisa dan harus menginisialisasikanya menggunakan
parameter pada primary constructor.
    open class Base(p: Int)
    class Derived(p: Int) : Base(p)

Jika ada secondary constructor maka dapat menggunakan keyword super.

Overriding methods
Seperti class sebelumnya di Kotlin jika kita ingin agar suatu method dapat di override
maka kita perlu menambahkan modifier secara eksplisit yaitu dengan keyword open.
    open class Shape {
        open fun draw() { ... }
        fun fill() { ... }
    }

    class Circle() : Shape() {
        override fun draw() { ... }
    }

Overriding properties
Sama seperti overriding class atau method

Overriding rules
Jika children class menurunkan lebih dari 1 class maka bisa menggunakan super<Parent>.method
    open class Rectangle {
        open fun draw() { ... }
    }

    interface Polygon {
        fun draw() { ... } // interface members are 'open' by default
    }

    class Square() : Rectangle(), Polygon {
        // The compiler requires draw() to be overridden:
        override fun draw() {
            super<Rectangle>.draw() // call to Rectangle.draw()
            super<Polygon>.draw() // call to Polygon.draw()
        }
    }

Abstract Class
Class yang tidak mempunyai implementasi di class tersebut, melainkan menyerahkan implementasi nya
kepada class lain yang meng inherit dari class tersebut.


Companion Object
Jika kita ingin property atau method dari sautu class bisa di akses dari class lain tanpa perlu
membuat instance dari class tersebut, maka bisa kita declare di companion object.

Visibility Modifiers
- private : visible di tempat dia dideklarasikan
- protected : sama seperti private hanya visible di subclass juga
- public (default) : visible everywhere
- internal : visible everywhere in the same module
 */