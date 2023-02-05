package com.academy.edhi.resume

/*

Extensions

Kotlin membolehkan kita meng extend suatu class dan menambahkan fungsionalitas baru tanpa perlu mewariskan nya dari class
atau tanpa perlu mengikuti Decorator design pattern. Di Kotlin bisa menggunkan fitur special declarations yang disebut Extensions
Misalnya : Kita bisa membuat function baru di class dari third-party yang mana kita tidak bisa memodifikasi. Dan kita bisa
memanggil fungsi tersebut dengan cara biasanya sama seperti jika function tersebut ada pada class asli nya. Mekanisme ini disebut function
extension. Ada juga properies extensions yang mana kita bisa men declare properti baru di class yang sudah ada.

Extensions Function
Untuk mendeklarasikan extension function, harus menyertakan prefix pada nama nya dengan receiver type.
Contoh : Menambahkan function swap pada MutableList<Int> (handson-package) ->


 */