package com.academy.edhi.resume

/*

Visibility Modifiers

Visibilitas Modifiers pada kotlin ada beberapa diantaranya :
    - public
    - private
    - protected
    - internal
Default modifiers yang mana jika tidak di include secara explisit adalah public

Packages
Funtion, class, interface, properties, object dapa di declare di top-level misalkan langsung didalam package
    // file name: example.kt
    package foo

    fun baz() { ... }
    class Bar { ... }

    - Jika tidak ada modifiers maka akan public, visible dimana pun
    - private, hanya visible didalam file saat di declare
    - internal, visible dimana pun di module yang sama
    - protected, tidak visible pada top-level declarations
Note : Untuk menggunkana top-level pada package lain tetap harus meng import nya.

Classes and Interfaces
Untuk member yang di deklarasikan dalam suatu class :
    - private, hanya visible di dalam kelas tersebut
    - protected, sama seperti private + visible untuk subclass
    - internal,
    - public
Note :  Pada Kotlin outer class tidak tau private member dari inner class nya.
        Jika mengoverride protected dan tidak mendeclare modifier lagi maka akan menjadi protected juga.

Constructor
Untuk menetapkan visibilitas constructor gunakan cara berikut dengan menyertakan keyword constructor secara ekplisit
    class C private constructor(a: Int) { ... }
Dengan begitu maka constructor menjadi private. Secara default semua constructor public dan visible dimana pun class tersebut
visible.

Local Variables
Local variabel, function, class tidak punya visibility modifiers

Modules
Internal visibility modifiers memungkinkan bahwa member tersebut visible dimana pun selama di module yang sama.



 */