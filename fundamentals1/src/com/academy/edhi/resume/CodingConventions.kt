package com.academy.edhi.resume

/* Coding Conventions

Source code organization

Directory Structure
In pure Kotlin project, directory structure yang direkomendasikan yaitu mengikuti structure package.
Misalkan package nya com.academy.edhi, maka semua subdirectory nya harus didalam package tersebut.

Source file names
Jika file hanya berisi satu class tertentu, maka direkomendasikan untuk menamakan file tersebut sama dengan nama kelas nya
menggunakan Pascal Case (CustomerService), nama harus mendeskripsikan apa fungsi dan tujuan dari file tersebut.

Source file organitations
Menempatkan banyak class atau top level function dalam satu class di Kotlin diperbolehkan, selama masih saling terkait satu sama lain,
dan tidak terlalu banyak baris code dalam file tersebut.
Untuk exstention function dari suatu class yang bisa digunakan oleh semua client dari class tersebut, maka buatlah function tersebut
didalam file dimana class tersebut di definisikan.
Sedangkan jika function tersebut hanya bisa digunakan oleh 1 client maka, buatlah di file client yang menggunakan function tersebut.

Class layout
Secara umum, isi dari suatu class terdiri dari :
    - deklarasi properti dan initializer blocks
    - constuctor secondary
    - deklarasi method
    - companion object

Jangan mengurutkan deklarasi method berdasarkan alpabet atau visibilitas, dan jangan memisahkan regular method dengan extention method,
tapi tempatkan mereka bersamaan, sehingga orang yang membaca class tersebut dari atas kebawah dapat memahami alur logika apa yang terjadi.

Interface implementation layout
Saat mengimplementasikan interface, jagalah urutan dari method yang implementasikan tetap sama, bila perlu tambahkan attribut private dari
method-method tersebut.

Overloads layout
Selalu letakan overloadsberdampingan satu sama lain didalam class tersebut

Naming rules
Aturan penamaan package dan class di Kotlin sangat sederhana :
    - nama untuk package selalu lowercase dan jangan menggunakan unserscore, jika membutuhkan lebih dari 1 kata makan gunakan camelCase.
    - nama class dan object menggunakan camel case yang diawali Upper Case Letter
For instance :
    open class DeclarationProcessor { ... }
    object EmptyDeclarationProcessor : DeclarationProcessor() { ... }

Function names
Penamaan function, properti dan local variable menggunakan camelCase, tanpa underscore
    fun processDeclarations() { ...  }
    var declarationCount = 1
Pengecualian : Untuk factory function yang digunakan untuk membuat instance dari suatu class boleh menggunakan nama yang sama dengan return type nya.
    interface Foo { ... }

    class FooImpl : Foo { ... }

    fun Foo(): Foo { return FooImpl() }

Names for test method
Untuk penamaan test method diperbolehkan menggunakan spasi yang dibungkus menggunakan backticks (tapi metodi ini belum support di runtime android).
Underscore juga penamaan yang biperbolehkan dalam membuat nama test method.

Property names
- Property dengan nilai yang tidak bisa dirubah (const), atau top level tau object val yang tidak ada punya get function yang memegang immutable data
seharusnya menggunakan UPPERCASE dengan pemisahnya under score.
 const val MAX_OUNT = 8
 val USER_NAME_FIELD = "Username"

- Top-level object yang memegang mutable data atau object dengan beberapa behaviour harus menggunakan camelCase.
 val mutableCollection: MutableSet<String> = HashSet()

- Object yang memegang references atau Singleton object bisa menggunakan model nama yang sama dengan object.
 val PersonComparator: Comparator<Person> = ....

- Untuk enum constant boleh menggunakan Uper Case dengan pemisah underscore atau menggunakan camelCase (sesuai kebutuhan).


Names for backing properties
Jika suatu class mempunyai 2 properti yang secara konsep sama, namun salah satu berasal dari public API sedangkan yang lainya
adalah implementasi detail maka gunakan underscore untuk private properti.
    class C {
        private val _elementList = mutableListOf<Element>()

        val elementList: List<Element>
             get() = _elementList
    }

Choosing good names
- Nama class biasanya kata kerja : what class is
- Nama method biasanya kata kerja : what method does
- Nama harus menderskipsikan suatu class atau method
- Akronim 2 hurup gunakan UPPER case, selebih nya gunakan camelcase : IOStream, HttpService

Formatting
Gunakan 4 spasi untuk indentasi, jangan gunakan tabs.
Kurung kurawal pembuka letakan dalam satu line dengan code.
    if (true) {
        ....
    }

Note : Pada Kotlin titik koma bersifat optional, karena sudah di design dengan assumsi style java.

Horizontal whitespace
Letakan spasi di antara binary operator (a + b), kecuali operator "rangte to" (1..10)
Jangan letakan sepasi diantara unary operator (a++)
Letakan spasi setelah statemen (if, when, for, while)
    if (true) {
        ....
    }

Jangan menaruh spasi sebelum kurung dalam primary constuctor, deklarasi method, dan pemanggilan method.
Jangan pernah menaruh spasi setelah (, [ atau sebelum ], ).
Jangan pernah meletakkan spasi di antara . atu ?.
Letakkan spasi setelah // : // this is comments
Jangan menaruh spasi diantara angle bracket untuk menetapkan type parameter : class Map<K, V> { ... }
Jangan meletakan spasi diantara :: , java::class
Jangan meletakkan spasi sebelum ? yang digunakan untuk menandai nullable type.

Colon (Titik dua)
Letakan soasi sebelum : untuk beberapa kasus ini :
 - Saat digunakan untuk memisahkan type dan subtype
 - Saat mendelegasikan dalam superclass constructor atau constuctor berbeda di class tersebut.
 - Setelah object keyword
 Jangan menaruh spasi sebelum : saat deklarasi variable dengan tipe data nya.
 Selalu letakkan spasi setelah :
    abstract class Foo<out T : Any> : IFoo {
        abstract fun foo(a: Int): T
    }

    class FooImpl : Foo() {
        constructor(x: String) : this(x) { /*...*/ }

        val x = object : IFoo { /*...*/ }
    }


























 */
