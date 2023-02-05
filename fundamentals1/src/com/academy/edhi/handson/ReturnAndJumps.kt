package com.academy.edhi.handson

/*

Return and jumps
Kita bisa memberikan label pada iterasi sehingga kita bisa melakukan break, continoue atau pun return berdasarkan label
yang sesuai.

 */

fun main() {

//    forku@ for(i in 1..10){
//        print("$i")
//        for(j in 1..10){
//            print("$j")
//            if(i == 5) break@forku
//        }
//        println("")
//    }

    for(i in 0..10){
        if(i == 5) break
        else if (i % 3 ==0) continue
        println(i)
    }

}