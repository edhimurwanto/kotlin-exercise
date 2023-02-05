package com.academy.edhi.resume

/*

Functional SAM interface
Interface yang hanya memiliki satu method abstract disebut juga Single Abstract Method atau functional interface.
Functional interface boleh memiliki banyak member yang mempunyai implement atau non-abstract tapi hanya boleh
memiliki 1 member yang abstract.

Untuk meng declare functional interface gunakan keyword fun
    fun interface KRunnable {
        fun invoke()
    }

SAM Convertions
Untuk functional interface kita bisa menggunakan SAM Convertions yang mana dapat membuat code kita lebih singkat
dan lebih mudah dibaca.
Dengan SAM convertion kita bisa merubah implementasi dari method yang add pada interface tersebut hanya dengan menggunakan lambda expression.

Contoh :
    fun interface IntPredicate {
       fun accept(i: Int): Boolean
    }

Jika tidak menggunakan SAM Convertions kita musti mengimplemen secara manual dengan meng override method dari interface tersebut.
    // Creating an instance of a class
    val isEven = object : IntPredicate {
       override fun accept(i: Int): Boolean {
           return i % 2 == 0
       }
    }

Dengan SAM Convertion kita hanya butuh menulis code kita menjadi seperti berikut :
    // Creating an instance using lambda
    val isEven = IntPredicate { it % 2 == 0 }

Lambda expression mengurangi semua code yang tidak dibutuhkan.
 */