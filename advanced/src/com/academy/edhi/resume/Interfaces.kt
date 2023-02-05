package com.academy.edhi.resume

/*

Interface
Interface di Kotlin dapat berisi abstract method, maupun method dengan implementasi. Yang membedakan
dengan abstract class yaitu pada interface tidak bisa memiliki state, boleh memiliki property
namun harus dibuat abstract atau butuh accessor untuk pengimplementasian.

Class atau object dapat meng implement satu atau lebih interface.
    class Child : MyInterface {
        override fun bar() {
            // body
        }
    }

Properties in interfaces
Bisa abstract atau pun sudah memiliki implementasi untuk accessor

Interface inheritance
Secara default class yang mengimplement interface hanya di haruskan untuk meng implement property atau
method yang tidak memiliki implementasi.

Resolving overriding conflict
Saat kita meng implement lebih dari 1 interface mungkin saja ada nama method yang sama dari interface-interface
tersebut sehingga mungkin saja saat kita meng override mereka bisa terjadi conflict, untuk mengatasi nya
kotlin menyediakan fitur yaitu seperti berikut :
    interface A {
        fun foo() { print("A") }
        fun bar()
    }

    interface B {
        fun foo() { print("B") }
        fun bar() { print("bar") }
    }

    class C : A {
        override fun bar() { print("bar") }
    }

    class D : A, B {
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
        }

        override fun bar() {
            super<B>.bar()
        }
    }

    Interface A dan B memiliki method foo dan bar, keduanya memiliki implementasi untuk method foo
    sedangkan bar hanya interface b yang memiliki implementasi. Tidak ada keyword absrtract disana
    karna di interface ini sudah menjadi default nya.
    Saat class lain meng implemen interface A maka method bar wajib di override kemudian di implementasikan.


 */