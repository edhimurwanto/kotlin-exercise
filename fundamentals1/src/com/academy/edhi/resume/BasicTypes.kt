package com.academy.edhi.resume

/*

Basic Types

Numbers
Type	    Size (bits)	            Min value	                            Max value
Byte	    8	                    -128	                                127
Short	    16	                    -32768	                                32767
Int	        32	                    -2,147,483,648 (-231)	                2,147,483,647 (231 - 1)
Long	    64	                    -9,223,372,036,854,775,808 (-263)	    9,223,372,036,854,775,807 (263 - 1)

Declaring it
    val one = 1 // Int
    val threeBillion = 30000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

Float and Double
Type	Size (bits)	    Significant bits	Exponent bits	Decimal digits
Float	32	            24	                8	            6-7
Double	64	            53	                11	            15-16

    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817


Literal Constant
Literal constants untuk nilai integral
- Decimals: 123
- Long tag by capital L : 23L
- Hexadecimal : 0x0F
- Binaries : 101001111

Note : Octal literal not supported in Kotlin

Kotlin support conventional notation of floating-points numbers
- Doubles by default: 123.5, 123.5e10
- Floats are tagged by f or F: 123.5f

Underscore in numeric literal
Anda dapat menambahkan underscore untuk nilai numeric agar lebih mudah terbaca
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

Explicit convertions
Tipe data yang lebih besar tidak bisa di conversikan ke tipe data yang lebih kecil, maka kita harus melakukan
konversi secara ekplisit. Sedangka kecil ke besar bisa langsung terkonversi otomatis.
    val b: Byte = 1 // OK, literals are checked statically
    val i: Int = b // ERROR

    val i: Int = b.toInt() // OK: explicitly widened
    print(i)

Setiap number bisa di konversikan ke tipe-tipe berikut:
    - toByte(): Byte
    - toShort(): Short
    - toInt(): Int
    - toLong(): Long
    - toFloat(): Float
    - toDouble(): Double
    - toChar(): Char

Selain diatas operasi matematika juga bisa menghasilkan konversi secara otomatis, misalkan menjumlahkan Long dengan Int
maka akan otomatis di konversikan menjadi Long.


Operation
Pembagian integer - setiap pembagian integer akan menghasilkan integer pula, maka jika ingin mengkonversikan nya ke floating-point
maka harus dilakukan secara ekplisit.
    val x = 5 / 2.toDouble()
    println(x == 2.5)

Character
Dideclarasikan dengan keyword Char, tidak bisa diperlakukan secara langsung sebagai interger. Tapi bisa dikonversikan secara
explisit :
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers
    }

Boolean
Mempresentasikan nilai boolean : true dan false
Build-ints operations di boolean :
  - || lazy disjuction
  - && laxy conjunction
  - !  negation

Array
Direpresentasikan dengan class Arrays
Mempunyai get, set function dan size property.
Declare array dapat menggunakan arrayOf keyword,
Atau bisa menggunakan arrayOfNulls untuk menentukan berapa jumlah element dari array tersebut, namus isi nya null
Atau alternative lainya yaitu menggunakan constuctor Array(...)

Primitive type arrays
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr = IntArray(5) { 42 }

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr = IntArray(5) { it * 1 }


String
String memiliki sifat immutable. Element dari String adalah char yang bisa diakses setipa index nya string[index].
String dapat diiterasikan menggunakan loop.
String bisa di concat menggunakan + operator
String juga bisa di concat dengan tipe lain, selama operan yang pertama mempunyai tipe data string.
String di Kotlin ada 2 tipe yaitu literal string dan template string.
Literal string yaitu string yang hanya murni string, bisa menggunakan """ untuk membuat string yang mempunyai indentation.
Template string yaitu string yang dihasilkan dari pemanggilan variable dengan $ yang mana nilai nya akan menjadi string.










 */