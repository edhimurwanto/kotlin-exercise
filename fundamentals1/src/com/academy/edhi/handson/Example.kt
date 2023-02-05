package com.academy.edhi.handson

fun main() {

    // Tolong cetak "EnigmaCamp" sebanyak 10 kali
//
//    val persons = arrayOf("Caca", "Agil", "Dea", "Yer")
//
//    for (person in persons){
//        println(person)
//    }
//
//    for (index in 0..persons.size){
//        println(persons[index])
//    }

    // menampilkan nilai genap dari 1-20
    /* langkah-langkah
    * 1. lakukan looping dari 1-20
    * 2. mencari nilai yang genap (modulus) / kondisi (if else, when)
    * 3. cetak nilai genap
    * */

    for(angka in 1..20){

        // when digunakan untuk alternatif if else
        when {
            (angka % 2 == 0) -> println("$angka adalah bil genap")
//            (angka % 2 != 0) -> println("$angka adalah bil genap")
        }

    }

    for(angka in 1..15){

        // when digunakan untuk alternatif if else
        when {
            (angka % 3 == 0 && angka % 5 == 0) -> println("FizzBuzz")
            (angka % 3 == 0) -> println("FizzBuzz")
            (angka % 5 == 0) -> println("FizzBuzz")
            else -> println(angka)

        }

    }

    /*

    Buatlah program untuk memilih menu makanan.
    Dapat memilih makanan dengan jumlah(qty),
    dan bisa memilih lebih dari 1 macam menu makanan.

    Output :

    ======= WARTEG ABCD =======

    Menu :
    1. Nasi Uduk    : Rp.10000
    2. Nasi Goreng  : Rp.15000
    3. Ayam Geprek  : Rp.25000
    4. Pecel Ayam   : Rp.18000

    Pilih Menu      : 1
    Jumlah (QTY)    : 2

    Apakah anda ingin menambah menu ? Y

    Menu :
    1. Nasi Uduk    : Rp.10000
    2. Nasi Goreng  : Rp.15000
    3. Ayam Geprek  : Rp.25000
    4. Pecel Ayam   : Rp.18000

    Pilih Menu      : 2
    Jumlah (QTY)    : 1

    Apakah anda ingin menambah menu ? N

    Pesanan Anda :
    1. Nasi Uduk    : 2
    2. Nasi Goreng  : 1

    Total           : Rp.35000

    ======= TERIMA KASIH =======

     */



}