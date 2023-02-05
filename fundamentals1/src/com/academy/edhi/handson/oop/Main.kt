package com.academy.edhi.handson.oop

/** NOTE :
 * Silabus belum sesuai -> materi pertama harusnya OOP
 * Contoh penggunaan inheritance -> gunakan no primary constructor agar tidak membingungkan
 * **/


class Person(){
    var firstName : String = ""
    var lastName : String = ""
}

class Address(val street: String, val city: String)

fun main() {

    val person = Person()
    val address = Address("Jalan H Dahlan", "Jakarta Selatan")

    println("${address.street}, ${address.city}")
}