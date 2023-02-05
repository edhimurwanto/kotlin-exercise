package com.academy.edhi.handson

class Response<T>(data: T){
    var data = data
}

fun main() {
    var nomor: Response<Int> = Response(100)
    var name: Response<String> = Response("Edi Murwanto")

    println(nomor.data)
    println(name.data)
}