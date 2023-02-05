package com.academy.edhi.handson

// declaring number
val one: Long = 1 // Int
val threeBillion = 3000000000 // Long
val oneLong = 1L // Long
val oneByte: Byte = 1
val oneMillion = 1_000_000 // Int

val PHI = 3.14
val exFloat = 128486826f

fun main() {

    val angkaLima = 5
    val angkaDua = 2

    val hasilBagi = angkaLima/angkaDua.toDouble()

    println(hasilBagi is Double)
    println(hasilBagi)

    val oneLong = one.toLong()
    val oneByte = one.toByte()

    val result = (one * threeBillion)

//    println(result is Long)
//
//    println(PHI is Double)
//    println(exFloat is Float)



//    checkDataType()
//    explisitConversion()
//    declareArray()
//    stringOperation()
}

fun checkDataType(){

    // checking data type
    println(one is Long)
    println(threeBillion is Long)
    println(oneLong is Long)
    println(oneByte is Byte)
    println(oneMillion is Int)
}

fun explisitConversion(){

    // explicit conversions
    println(one.toByte() is Byte)
    println(threeBillion.toFloat() is Float)
    println(oneLong.toInt() is Int)
    println(oneByte.toChar() is Char)
    println(oneMillion.toDouble() is Double)
}

fun declareArray(){
    val numbers = arrayOf(10, 12, 15, 18, 6, 1)
    val nullableNumbers = arrayOfNulls<Int>(5)
    val intNumbers = IntArray(5)
    val intNumbersWithValues = IntArray(5) { it * 2}
    val intNumbersWithValuesTwo = intArrayOf(1,2,3,4,5)

    println(numbers.joinToString())
    println(nullableNumbers.joinToString())
    println(intNumbers.joinToString())
    println(intNumbersWithValues.joinToString())
    println(intNumbersWithValuesTwo.joinToString())
}

fun stringOperation(){
    val myFirstName: String = "Edi"
    val myLastName: String = "Murwanto"
    val myAddress: String = """
        Jalan   : H Dahlan No 4,
        Kota    : Jakarta Selatan
    """.trimIndent()

    for(i in 0 until myFirstName.length){
        println(myFirstName[i])
    }

    println("$myFirstName $myLastName")
    println(myAddress)
}