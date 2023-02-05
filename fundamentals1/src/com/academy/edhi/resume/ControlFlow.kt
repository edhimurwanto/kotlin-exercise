package com.academy.edhi.resume

/*

Control flow

If condition
There is no ternary in Kotlin because if else work same.
    val max = if (a > b) a else b

When statemen
When statemen ini menggantikan switch case yang ada pada bahasa pemrogramman lain.

    when(a){
        1 -> "One"
        2 -> "Two"
        ...
        else -> "NaN"
   }
else ibarat default statement daripada when tersebut jika tidak ada case yang terpenuhi dan else bersifat mandatory.
case bisa disertai tanda koma untuk yang lebih dari 1
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

case bisa juga menggunakan suatu ekpresi bukan hanya constant
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }

Bisa juga melakukan pengecekan range..to
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

Bisa juga dengan mengecek type data nya menggunakan is
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

When juga bisa untuk menggantikan if else statement
    when {
        x.isOdd() -> print("x is odd")
        y.isEven() -> print("y is even")
        else -> print("x+y is even.")
    }


For Loops
For di kotlin sama seperti bahasa pemrogramman lain hanya beda sedikit syntax code nya
Syntax:
    for (item in collection) print(item)

    Atau bisa mempunyai block
    for (item: Int in ints) {
        // ...
    }

For mengiterasikan semua yang bisa di iterasikan
- mempunyai member atau extension-function iterate(), yang merupakan return type
- mempunyai member atau extension-function next(),
- mempunyai member atau extension-function hasNext() yang me return Boolean


While
While atau do-while berjalan sebagaimana biasanya

Break dan continue juga support di Kotlin.




 */