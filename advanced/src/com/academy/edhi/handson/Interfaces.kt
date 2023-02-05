package com.academy.edhi.handson

fun main() {
    var e = E()
    e.foo()
    e.bar()
}

interface A {

    fun foo(){
        println("foo from interface A")
    }

    fun bar()

}

interface B {

    fun foo(){
        println("foo from interface B")
    }

    fun bar(){
        println("bar from interface B")
    }
}

// C implemen A then must override bar, cause it's abstract
class C : A {
    override fun bar() {
        TODO("Not yet implemented")
    }
}

// D implement B then not have to implemen any method, cause B have the implemen at all
class D : B {

}

// implemen A and B and how to resolve conflict override method
class E : A, B {

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar() // can just be super.bar() it reference to B
    }
}