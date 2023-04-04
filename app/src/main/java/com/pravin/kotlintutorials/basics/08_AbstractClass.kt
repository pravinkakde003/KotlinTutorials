package com.pravin.kotlintutorials.basics

/**
 * Its partially defined class
 * You cannot create instance of abstract class
 * Abstract method have no body when they declared
 * Abstract property cannot initialize when they declared
 *
 * All the variables and functions by-default non-abstract-if we want to make
 * Abstract properties and class are 'open' by default
 * 'open' function ready to be overridden and its optional
 */

fun main() {
    // Not allowed. You cannot create instance of abstract class
   //  var abstractClassObject = AbstractClassExample()

    // Allowed. Abstract Super class reference variable
    var derivedClassObject = DerivedClass()


    derivedClassObject.name = "Pravin"
    derivedClassObject.eat()
    derivedClassObject.goToSchool()
}

//Abstract classes are open for extending by default.

abstract class AbstractClassExample {
    abstract var name: String
    abstract fun eat()      // abstract properties are 'open' by default
    open fun getHeight() {} // A 'open' function ready to be overridden

    // A normal function
    fun goToSchool() {
        println("In function goToSchool()")
    }
}

class DerivedClass : AbstractClassExample() {
    override var name: String = "In derivedClass"

    // compulsory to override
    override fun eat() {
        println("In function eat()")
        println("Value of name is : $name")
    }

    // optional to override
    override fun getHeight() {

    }
}
